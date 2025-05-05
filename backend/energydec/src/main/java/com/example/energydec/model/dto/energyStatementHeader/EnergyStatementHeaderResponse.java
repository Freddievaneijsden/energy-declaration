package com.example.energydec.model.dto.energyStatementHeader;

public record EnergyStatementHeaderResponse(
        Integer id,
        String status,
        String name,
        String version,
        String author
) {
}
