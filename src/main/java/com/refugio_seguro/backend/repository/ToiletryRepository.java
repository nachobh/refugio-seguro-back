package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Toiletry;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface ToiletryRepository extends ListCrudRepository<Toiletry, Long>,
                                            JpaSpecificationExecutor<Toiletry> {
}