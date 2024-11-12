package com.refugio_seguro.backend.controller;

import com.refugio_seguro.backend.model.Shelter;
import com.refugio_seguro.backend.service.ShelterGetByClosestLocationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class ShelterGetByClosestLocationController {

    private final ShelterGetByClosestLocationService shelterGetByClosestLocationService;

    @GetMapping("shelter-search-by-closest-location")
    List<Shelter> getByClosestLocation(@RequestParam BigDecimal latitude, @RequestParam BigDecimal longitude) {
        return shelterGetByClosestLocationService.execute(latitude, longitude);
    }
}
