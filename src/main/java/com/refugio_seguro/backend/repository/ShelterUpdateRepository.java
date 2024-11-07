package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.ShelterUpdate;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface ShelterUpdateRepository extends ListCrudRepository<ShelterUpdate, Long>,
                                                 JpaSpecificationExecutor<ShelterUpdate> {
}