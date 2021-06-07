begin
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Mason','Mount',to_date('20/03/1985','DD/MM/RRRR'),'22');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Kepa','Arrizabalaga',to_date('03/10/1994','DD/MM/RRRR'),'26');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Willy','Caballero',to_date('28/09/1981','DD/MM/RRRR'),'39');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Edouard','Mendy',to_date('01/03/1992','DD/MM/RRRR'),'29');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Karlo','Žiger',to_date('11/05/2001','DD/MM/RRRR'),'20');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Antonio','Rüdiger',to_date('03/03/1993','DD/MM/RRRR'),'28');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Andreas Bødtker','Christensen',to_date('10/04/1996','DD/MM/RRRR'),'25');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Thiago','Silva',to_date('22/09/1984','DD/MM/RRRR'),'36');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'N''Golo','Kanté',to_date('29/03/1991','DD/MM/RRRR'),'30');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Timo','Werner',to_date('06/03/1996','DD/MM/RRRR'),'25');
    Insert into clientes (ID,NOMBRE,APELLIDO,FECHA_NACIMIENTO,EDAD) values (clientes_seq.nextval,'Olivier','Giroud',to_date('30/09/1986','DD/MM/RRRR'),'34');

    commit;

exception
    when others then
        rollback;
        raise;
end;
