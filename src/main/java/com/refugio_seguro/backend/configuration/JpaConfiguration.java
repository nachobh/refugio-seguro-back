package com.refugio_seguro.backend.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootConfiguration
@EntityScan("com.refugio_seguro.backend.model")
public class JpaConfiguration {}
