package com.example.energydec.model.mapper;

import com.example.energydec.model.dto.energyStatementHeader.EnergyStatementHeaderCreate;
import com.example.energydec.model.dto.energyStatementHeader.EnergyStatementHeaderResponse;
import com.example.energydec.model.dto.energyStatementHeader.EnergyStatementHeaderUpdate;
import com.example.energydec.model.entity.EnergyStatementHeader;
import com.example.energydec.model.entity.Status;
import java.util.Objects;

public class EnergyStatementHeaderMapper {

    private EnergyStatementHeaderMapper() {
    }

    public static EnergyStatementHeaderResponse map(EnergyStatementHeader energyStatementHeader) {
        if (Objects.isNull(energyStatementHeader)) {
            return null;
        }

        return new EnergyStatementHeaderResponse(
                energyStatementHeader.getId(),
                energyStatementHeader.getStatus().toString(),
                energyStatementHeader.getName(),
                energyStatementHeader.getVersion(),
                energyStatementHeader.getAuthor()
        );
    }

    public static EnergyStatementHeader map(EnergyStatementHeaderCreate energyStatementHeaderCreate) {
        if (Objects.isNull(energyStatementHeaderCreate)) {
            return null;
        }

        EnergyStatementHeader energyStatementHeader = new EnergyStatementHeader();

        energyStatementHeader.setStatus(Status.valueOf(energyStatementHeaderCreate.status()));
        energyStatementHeader.setName(energyStatementHeaderCreate.name());
        energyStatementHeader.setVersion(energyStatementHeaderCreate.version());
        energyStatementHeader.setAuthor(energyStatementHeaderCreate.author());

        return energyStatementHeader;
    }

    public static void map(EnergyStatementHeaderUpdate energyStatementHeaderUpdate, EnergyStatementHeader oldEnergyStatementHeader) {
        if (Objects.nonNull(energyStatementHeaderUpdate.status())) {
            oldEnergyStatementHeader.setStatus(Status.valueOf(energyStatementHeaderUpdate.status()));
        }

        if (Objects.nonNull(energyStatementHeaderUpdate.version())) {
            oldEnergyStatementHeader.setVersion(energyStatementHeaderUpdate.version());
        }
    }
}
