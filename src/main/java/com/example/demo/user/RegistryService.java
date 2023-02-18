package com.example.demo.user;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class RegistryService {

    @GetMapping
    public List<Registry> getRegistries(){
        return List.of(
                new Registry(
                        "test",
                        "test@gmail.com",
                        true
                )
        );
    }
}
