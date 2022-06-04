INSERT INTO productos (descripcion, nombre, precio,tiempo_estimado_de_preparacion) VALUES ("Pizza napolitana, tomates, queso, oregano", "PIZZA-NAPOLITANA-GRANDE", 36000,"120");
INSERT INTO administradores(username, password) VALUES ("admin", "admin");
INSERT INTO administradores(username, password) VALUES ("admin1", "admin1");
INSERT INTO administradores(username, password) VALUES ("admin2", "admin2");
INSERT INTO administradores(username, password) VALUES ("admin3", "admin3");

INSERT INTO sucursales (nombre, hora_de_apertura, hora_de_cierre, costo_enviokm, is_open) VALUES ("sucursal0","06:30:00", "21:30:00",2500,false);

INSErt INTO clientes (nombres, apellidos, cedula, correo, username, password, fecha_de_nacimiento, genero) VALUES ("pepito andres","ramires rodriguez","3231234","pepito@gmail.com","pepito1234","1234","1980:01:01","MASCULINO");