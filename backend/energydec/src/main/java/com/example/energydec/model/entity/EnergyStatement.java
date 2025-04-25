package com.example.energydec.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class EnergyStatement {

    @Id
    private Integer id;

    private Integer headerId;

    private LocalDate declarationDate;

    private Integer buildingId;

    private Double energyPerformance; //Energiprestanda (kWh/m²)

    private String inspectionCompany;

    private String inspector;

    @OneToOne
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private EnergyStatementHeader header;
}
