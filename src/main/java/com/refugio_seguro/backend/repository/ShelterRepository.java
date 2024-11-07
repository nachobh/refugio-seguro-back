package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Shelter;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface ShelterRepository extends ListCrudRepository<Shelter, Long>,
                                           JpaSpecificationExecutor<Shelter> {
}