package com.example.demo.config;

import com.example.demo.model.Registry;
import com.example.demo.repository.RegistryRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class RegistryConfig {

    Faker faker = new Faker();

    @Bean
    CommandLineRunner commandLineRunner(RegistryRepository registryRepository){
        return args -> {

            Registry a = new Registry(
                    faker.name().firstName(),
                    faker.company().name(),
                    faker.bool().bool()
            );

            Registry t = new Registry(
                    faker.name().firstName(),
                    faker.company().name(),
                    faker.bool().bool()
            );

            registryRepository.saveAll(
                    Arrays.asList(a, t)
            );
        };
    }
}
