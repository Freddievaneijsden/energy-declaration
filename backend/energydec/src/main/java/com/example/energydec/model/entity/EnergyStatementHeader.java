package com.example.energydec.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EnergyStatementHeader {

    @Id
    private Integer id;

    private Status status;

    private String name;

    private String version;

    private String author;

    @OneToOne(mappedBy = "header", cascade = CascadeType.ALL)
    private EnergyStatement energyStatement;
}
