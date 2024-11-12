package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.CleaningUtility;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Hidden
@RepositoryRestResource(exported = false)
public interface CleaningUtilityRepository extends JpaRepository<CleaningUtility, Long>,
                                                   ListPagingAndSortingRepository<CleaningUtility, Long>,
                                                   JpaSpecificationExecutor<CleaningUtility> {
}