INSERT INTO regiones (name) VALUES ('Europa');
INSERT INTO regiones (name) VALUES ('Africa');
INSERT INTO regiones (name) VALUES ('Asia');
INSERT INTO regiones (name) VALUES ('Oceania');
INSERT INTO regiones (name) VALUES ('Antartida');
INSERT INTO regiones (name) VALUES ('SudaAmerica');
INSERT INTO regiones (name) VALUES ('CentroAmerica');
INSERT INTO regiones (name) VALUES ('NorteAmerica');


INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Jose','Perez','jp@email.com',651212,NOW(),1);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Carlos','Lopez','cl@email.com',651212,NOW(),2);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Maria','Roman','mr@email.com',651212,NOW(),3);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Dina','Ramirez','dr@email.com',651212,NOW(),4);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Emilio','Gomez','eg@email.com',651212,NOW(),5);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Victor','Gonzalez','vg@email.com',651212,NOW(),6);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Juan','Solas','js@email.com',651212,NOW(),7);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Pepe','Mujica','pm@email.com',651212,NOW(),8);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Enrrique','Iglesias','ei@email.com',651212,NOW(),1);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Pedro','Diaz','pd@email.com',651212,NOW(),2);
INSERT INTO clientes(nombre,apellido,email,telefono,created_at,id_region) VALUES('Ramon','Sanchez','rs@email.com',651212,NOW(),3);

INSERT INTO productos(nombre) VALUES("MONITOR AOC");
INSERT INTO productos(nombre) VALUES("MOUSE LINK");
INSERT INTO productos(nombre) VALUES("ORDENADOR DELL");
INSERT INTO productos(nombre) VALUES("DISCO DURO SSD");
INSERT INTO productos(nombre) VALUES("DISCO EXTERNO SATELLITE");

INSERT INTO ventas(iva,subtotal,total,cliente_id) VALUES(21.0,200.0,221.0,5);
INSERT INTO ventas_producto(venta_id,producto_id) VALUES(1,1)
INSERT INTO ventas_producto(venta_id,producto_id) VALUES(1,2)
INSERT INTO ventas_producto(venta_id,producto_id) VALUES(1,3)
