package com.example.demo.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class RegistryService {

    @Autowired
    public RegistryService(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    private final RegistryRepository registryRepository;

    @GetMapping
    public List<Registry> getRegistries(){
       return registryRepository.findAll();
    }
}
