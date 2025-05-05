package com.example.energydec.model.mapper;

import com.example.energydec.model.dto.energyStatement.EnergyStatementCreate;
import com.example.energydec.model.dto.energyStatement.EnergyStatementResponse;
import com.example.energydec.model.dto.energyStatement.EnergyStatementUpdate;
import com.example.energydec.model.entity.EnergyStatement;

import java.time.LocalDate;
import java.util.Objects;

public class EnergyStatementMapper {

    public EnergyStatementResponse map(EnergyStatement energyStatement) {
        if (Objects.isNull(energyStatement)) {
            return null;
        }

        var declarationDate = energyStatement.getDeclarationDate().toString();

        return new EnergyStatementResponse(
                energyStatement.getId(),
                energyStatement.getHeaderId(),
                declarationDate,
                energyStatement.getBuildingId(),
                energyStatement.getEnergyPerformance(),
                energyStatement.getInspectionCompany(),
                energyStatement.getInspector()
        );
    }

    public EnergyStatement map(EnergyStatementCreate energyStatementCreate) {
        if (Objects.isNull(energyStatementCreate)) {
            return null;
        }

        EnergyStatement energyStatement = new EnergyStatement();

        energyStatement.setHeaderId(energyStatementCreate.headerId());
        energyStatement.setDeclarationDate(LocalDate.parse(energyStatementCreate.declarationDate()));
        energyStatement.setBuildingId(energyStatementCreate.buildingId());
        energyStatement.setEnergyPerformance(energyStatementCreate.energyPerformance());
        energyStatement.setInspectionCompany(energyStatementCreate.inspectionCompany());
        energyStatement.setInspector(energyStatementCreate.inspector());

        return energyStatement;
    }

    public void map(EnergyStatementUpdate energyStatementUpdate, EnergyStatement oldEnergyStatement) {
        if (Objects.nonNull(energyStatementUpdate.declarationDate())) {
            oldEnergyStatement.setDeclarationDate(LocalDate.parse(energyStatementUpdate.declarationDate()));
        }

        if (Objects.nonNull(energyStatementUpdate.buildingId())) {
            oldEnergyStatement.setBuildingId(energyStatementUpdate.buildingId());
        }

        if (Objects.nonNull(energyStatementUpdate.energyPerformance())) {
            oldEnergyStatement.setEnergyPerformance(energyStatementUpdate.energyPerformance());
        }

        if (Objects.nonNull(energyStatementUpdate.inspector())) {
            oldEnergyStatement.setInspector(energyStatementUpdate.inspector());
        }

        if (Objects.nonNull(energyStatementUpdate.energyPerformance())) {
            oldEnergyStatement.setEnergyPerformance(energyStatementUpdate.energyPerformance());
        }

    }
}
