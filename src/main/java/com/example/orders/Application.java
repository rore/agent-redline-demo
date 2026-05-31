package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot bootstrap entry point.
 *
 * Exists primarily so SpringDoc's OpenAPI generator has an application
 * context to start. Running tasks like `./gradlew generateOpenApiDocs`
 * boots the app on a random port, scrapes /v3/api-docs.yaml, writes the
 * spec to build/openapi.yaml, and shuts the app down.
 *
 * For demo purposes only — the in-memory adapter doesn't need real
 * persistence, and the controller is the entire surface that matters.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
