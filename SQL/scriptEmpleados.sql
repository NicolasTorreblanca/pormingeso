CREATE DATABASE empleados;

use empleados;
CREATE TABLE empleados
(
id int primary key not null,
nombre varchar (50),
categoria varchar (50)
);

INSERT INTO empleados(id,nombre,categoria) VALUES ('1', 'Julio Ramirez', 'Guardia');
INSERT INTO empleados(id,nombre,categoria) VALUES ('2', 'Ignacio Moya', 'Atencion al Cliente');
INSERT INTO empleados(id,nombre,categoria) VALUES ('3', 'Juan Mayorga', 'Conserje');
INSERT INTO empleados(id,nombre,categoria) VALUES ('4', 'Miguel Mayorga', 'Gerencia');
INSERT INTO empleados(id,nombre,categoria) VALUES ('5', 'Barbara Guerrero', 'Accionista');
INSERT INTO empleados(id,nombre,categoria) VALUES ('6', 'Ivan Ubilla', 'Atencion al Cliente');
INSERT INTO empleados(id,nombre,categoria) VALUES ('7', 'Maximiliano Medel', 'Accionista');
INSERT INTO empleados(id,nombre,categoria) VALUES ('8', 'Gabriel Duran', 'Gerencia');
INSERT INTO empleados(id,nombre,categoria) VALUES ('9', 'Andrea Castro', 'Secretaria');