package com.example.demo.services;

import com.example.demo.converters.RegistryConverter;
import com.example.demo.models.dtos.RegistryDTO;
import com.example.demo.models.entities.Registry;
import com.example.demo.repositories.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistryService {
    private final RegistryRepository registryRepository;

    private final RegistryConverter registryConverter;

    @Autowired
    public RegistryService(RegistryRepository registryRepository, RegistryConverter registryConverter) {
        this.registryRepository = registryRepository;
        this.registryConverter = registryConverter;
    }

    @GetMapping
    public List<RegistryDTO> getRegistries() {
        List<RegistryDTO> registryDTOList = new ArrayList<RegistryDTO>();
        List<Registry> registryList = registryRepository.findAll();

        for (Registry registry : registryList) {
            registryDTOList.add(registryConverter.convert(registry));
        }

        return registryDTOList;
    }
}
