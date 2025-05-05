package com.example.energydec.model.dto;

import org.springframework.lang.NonNull;

public record EnergyStatementCreate (
        @NonNull Integer headerId,
        String declarationDate,
        Integer buildingId,
        Double energyPerformance,
        String inspectionCompany,
        String inspector)
{
}
