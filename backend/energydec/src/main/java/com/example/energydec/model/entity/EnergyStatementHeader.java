package com.example.energydec.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class EnergyStatementHeader {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String name;

    private String version;

    private String author;
}
