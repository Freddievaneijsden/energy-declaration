CREATE TABLE energy_statement_header
(
    id      INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    status  VARCHAR(255),
    name    VARCHAR(255),
    version VARCHAR(255),
    author  VARCHAR(255),
    CONSTRAINT pk_energystatementheader PRIMARY KEY (id)
);

CREATE TABLE energy_statement
(
    id                 INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    header_id          INTEGER,
    declaration_date   date,
    building_id        INTEGER,
    energy_performance DOUBLE PRECISION,
    inspection_company VARCHAR(255),
    inspector          VARCHAR(255),
    CONSTRAINT pk_energystatement PRIMARY KEY (id),
    CONSTRAINT fk_energystatement_on_header FOREIGN KEY (header_id) REFERENCES energy_statement_header (id),
    CONSTRAINT uc_energystatement_header UNIQUE (header_id)
);
