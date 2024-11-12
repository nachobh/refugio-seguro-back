package com.refugio_seguro.backend.service;

import com.refugio_seguro.backend.model.Shelter;
import com.refugio_seguro.backend.repository.ShelterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShelterGetByClosestLocationService {
    private final ShelterRepository shelterRepository;

    public List<Shelter> execute(BigDecimal latitude, BigDecimal longitude) {
        List<Shelter> all = shelterRepository.findAll();
        all.sort((shelterA, shelterB) ->
                (int) (getDistanceFromPointForShelter(latitude, longitude, shelterA) -
                        getDistanceFromPointForShelter(latitude, longitude, shelterB)));
        return all;

    }

    private static double getDistanceFromPointForShelter(BigDecimal latitude, BigDecimal longitude, Shelter shelterA) {
        return Math.sqrt(Math.pow(shelterA.getLocation().getLatitud().subtract(latitude).toBigIntegerExact().doubleValue(), 2)
                + Math.pow(shelterA.getLocation().getLongitud().subtract(longitude).toBigIntegerExact().doubleValue()
                , 2));
    }
}
