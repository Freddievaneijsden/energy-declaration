package com.example.energydec.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EnergyStatement {

    @Id
    private Integer id;

    @Column(name = "header_id", insertable = false, updatable = false)
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
