package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Shelter;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ShelterRepository extends ListCrudRepository<Shelter, Long>,
                                           ListPagingAndSortingRepository<Shelter, Long>,
                                           JpaSpecificationExecutor<Shelter> {
}