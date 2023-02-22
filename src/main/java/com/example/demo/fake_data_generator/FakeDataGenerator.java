package com.example.demo.fake_data_generator;

import com.example.demo.models.entities.Registry;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class FakeDataGenerator {

    public Registry generateFakeData() {
        Faker faker = new Faker();

        return new Registry(
                faker.name().firstName(),
                faker.company().name(),
                faker.bool().bool()
        );
    }
}
