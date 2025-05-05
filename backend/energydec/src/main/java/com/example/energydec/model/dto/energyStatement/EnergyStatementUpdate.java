package com.example.energydec.model.dto.energyStatement;

public record EnergyStatementUpdate (
        String declarationDate,
        Integer buildingId,
        Double energyPerformance,
        String inspectionCompany,
        String inspector){
}
