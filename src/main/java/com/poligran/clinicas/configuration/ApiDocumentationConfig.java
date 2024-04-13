package com.poligran.clinicas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ApiDocumentationConfig {

	@Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("ARQUITECTURA DE SOFTWARE")
                        .description("SOA")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("Grupo B01 Subgrupo 1")
                                .email("nacamacho@poligran.edu.co")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentation")
                        .url("https://github.com/Ncamacho2/Clinica"));
    }

    
}
