package com.example.energydec.model.entity;

import jakarta.persistence.*;

@Entity
public class EnergyStatementHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String name;

    private String version;

    private String author;
}
