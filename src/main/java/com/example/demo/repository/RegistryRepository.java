package com.example.demo.repository;

import com.example.demo.model.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {

}
