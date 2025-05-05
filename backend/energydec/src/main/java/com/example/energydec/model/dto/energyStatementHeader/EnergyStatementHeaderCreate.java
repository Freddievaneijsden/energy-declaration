package com.example.energydec.model.dto.energyStatementHeader;

public record EnergyStatementHeaderCreate(
        String status,
        String name,
        String version,
        String author
) {
}
