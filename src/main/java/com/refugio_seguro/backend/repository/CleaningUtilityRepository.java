package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.CleaningUtility;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface CleaningUtilityRepository extends ListCrudRepository<CleaningUtility, Long>,
                                                   JpaSpecificationExecutor<CleaningUtility> {
}