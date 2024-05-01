package com.example.config;

import java.net.URI;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bookshop")
public record ClientProperties(
        @NotNull
        URI catalogServiceUri
) {
}
