
CREATE TABLE clientes
  (
    id               NUMBER NOT NULL PRIMARY KEY,
    nombre           VARCHAR2(255) NOT NULL,
    apellido         VARCHAR2(255),
    fecha_nacimiento DATE,
    edad             number
  );
  
CREATE SEQUENCE clientes_seq
  MINVALUE 1
  START WITH 1
  INCREMENT BY 1
  CACHE 20;
