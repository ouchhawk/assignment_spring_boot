package com.example.demo.models.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Registry {

    @Id
    @SequenceGenerator(
            name = "registry_sequence",
            sequenceName = "registry_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "registry_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private Boolean isActive;

    public Registry() {
    }

    public Registry(Long id, String name, String email, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }

    public Registry(String name, String email, Boolean isActive) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}