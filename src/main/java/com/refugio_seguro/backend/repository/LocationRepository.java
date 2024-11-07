package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Location;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface LocationRepository extends ListCrudRepository<Location, Long>,
                                            JpaSpecificationExecutor<Location> {
}