package com.example.energydec.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EnergyStatement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public LocalDate getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(LocalDate declarationDate) {
        this.declarationDate = declarationDate;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Double getEnergyPerformance() {
        return energyPerformance;
    }

    public void setEnergyPerformance(Double energyPerformance) {
        this.energyPerformance = energyPerformance;
    }

    public String getInspectionCompany() {
        return inspectionCompany;
    }

    public void setInspectionCompany(String inspectionCompany) {
        this.inspectionCompany = inspectionCompany;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public EnergyStatementHeader getHeader() {
        return header;
    }

    public void setHeader(EnergyStatementHeader header) {
        this.header = header;
    }
}
