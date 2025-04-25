package com.example.energydec.model.entity;

import java.time.LocalDate;

public class EnergyStatement {

    Integer id;

    Integer headerId;

    LocalDate declarationDate;

    Integer buildingId;

    Double energyPerformance; //Energiprestanda (kWh/m²)

    String inspectionCompany;

    String inspector;
}
