-----------------------------------------USUARIOS-------------------------------------
INSERT INTO usuarios(nombre, apellido, email, fecha_alta) VALUES('Roman', 'Garcia', 'rga@gamil.com', '2020-05-06');
INSERT INTO usuarios(nombre, apellido, email, fecha_alta) VALUES('Namor', 'Gara', 'total@gamil.com', '2019-10-06');

-----------------------------------------ROLES---------------------------------------
INSERT INTO roles(tipo) VALUES('ADMIN');
INSERT INTO roles(tipo) VALUES('USER');

-----------------------------------------ENTRADAS-----------------------------------
INSERT INTO entradas(titulo,texto,valoracion,fecha_subida) VALUES('Restaurante el LLantar','texto hablando sobre el restaurante el llantar',4,'2020-05-06');

---------------------------------------COMENTARIOS----------------------------------
INSERT INTO comentarios(texto, fecha_comentario) VALUES('Primer comentario sobre un restaurante','2017-05-06');