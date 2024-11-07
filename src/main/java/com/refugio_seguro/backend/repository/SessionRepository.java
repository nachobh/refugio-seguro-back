package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Session;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Long>,
                                           JpaSpecificationExecutor<Session> {
}