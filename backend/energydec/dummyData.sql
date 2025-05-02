INSERT INTO energy_statement_header (status, name, version, author)
VALUES ( 'INACTIVE', 'Declaration A', '1.0', 'Alice Andersson'),
       ( 'ACTIVE', 'Declaration B', '1.1', 'Bob Berg'),
       ('INACTIVE', 'Declaration C', '1.0', 'Carla Carlsson'),
       ( 'ACTIVE', 'Declaration D', '2.0', 'David Dahl'),
       ( 'ACTIVE', 'Declaration E', '1.2', 'Eva Ek');

INSERT INTO energy_statement (header_id, declaration_date, building_id, energy_performance, inspection_company,
                              inspector)
VALUES (1, '2024-05-01', 1001, 95.5, 'EcoInspect AB', 'Anna Ahlgren'),
       (2, '2024-04-21', 1002, 110.2, 'GreenCertify', 'Bertil Blom'),
       (3, '2024-04-15', 1003, 87.0, 'SafeEnergy Co.', 'Cecilia Ceder'),
       (4, '2024-03-30', 1004, 102.4, 'CertiSure', 'Daniel Damm'),
       (5, '2024-03-25', 1005, 99.9, 'EnergoCheck', 'Erik Ekholm');
