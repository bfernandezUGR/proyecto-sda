-- Datos iniciales para H2
INSERT INTO USUARIO (usuario, password, nombre, apellidos, fecha_inicio, fecha_fin, activo, rol) VALUES
('admin', 'admin', 'Administrador', 'UGR', '2025-01-01', NULL, TRUE, 'ADMIN'),
('usuario1', 'usuario1', 'Juan', 'Pérez', '2025-01-01', NULL, TRUE, 'USER');

INSERT INTO PRODUCTO (nombre, descripcion, precio, disponible, categoria) VALUES
('Servicio de impresión', 'Impresión de documentos en campus', 0.10, TRUE, 'Servicios'),
('Camiseta UGR', 'Camiseta oficial de la Universidad de Granada', 12.50, TRUE, 'Productos');
