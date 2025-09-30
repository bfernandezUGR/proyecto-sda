CREATE TABLE IF NOT EXISTS USUARIO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    fecha_inicio DATE,
    fecha_fin DATE,
    activo BOOLEAN,
    rol VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS PRODUCTO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DOUBLE,
    disponible BOOLEAN,
    categoria VARCHAR(50)
);
