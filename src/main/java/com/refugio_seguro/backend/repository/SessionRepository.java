package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Session;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SessionRepository extends ListCrudRepository<Session, Long>,
                                           ListPagingAndSortingRepository<Session, Long>,
                                           JpaSpecificationExecutor<Session> {
}