package com.refugio_seguro.backend.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.refugio_seguro.backend.controller")
public class ControllerConfiguration {

    @Bean
    public OpenAPI refugioSeguroOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Refugio Seguro API")
                .description("Refugio Seguro")
                .version("1.0"));
    }
}
