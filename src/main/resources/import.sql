-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into Conta (id, nomeDono, saldo, numeroConta) values(1, 'Calebe', '1000.00', '000.000.10');

insert into Conta (id, nomeDono, saldo, numeroConta) values(2, 'Marcelo', '000.00', '000.000.50');

insert into Conta (id, nomeDono, saldo, numeroConta) values(3, 'Leonardo', '100000.00', '000.000.80');