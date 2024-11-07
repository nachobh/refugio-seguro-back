package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long>, JpaSpecificationExecutor<User> {
}