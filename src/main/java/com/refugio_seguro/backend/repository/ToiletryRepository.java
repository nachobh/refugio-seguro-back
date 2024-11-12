package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Toiletry;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Hidden
@RepositoryRestResource(exported = false)
public interface ToiletryRepository extends JpaRepository<Toiletry, Long>,
                                            ListPagingAndSortingRepository<Toiletry, Long>,
                                            JpaSpecificationExecutor<Toiletry> {
}