package com.example.demo.converters;

import com.example.demo.models.dtos.RegistryDTO;
import com.example.demo.models.entities.Registry;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RegistryConverter implements Converter<Registry, RegistryDTO> {
    @Override
    public RegistryDTO convert(Registry source) {
        RegistryDTO registryDTO = new RegistryDTO();
        registryDTO.setName(source.getName());
        registryDTO.setEmail(source.getEmail());
        registryDTO.setActive(source.getActive());

        return registryDTO;
    }
}