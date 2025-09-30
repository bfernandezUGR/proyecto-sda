# Gestión UGR de Servicio Dinámico de Adquisición

Aplicación web para la gestión dinámica de productos y servicios de la Universidad de Granada.

## Tecnologías
- Spring Boot (backend)
- Bootstrap 5+ (frontend)
- H2 (desarrollo), Oracle (preproducción/producción)
- Maven
- Java 21

## Estructura del proyecto
- src/main/java: Código fuente (modelo, repositorio, servicio, controlador)
- src/main/webapp: Vistas (Bootstrap)
- src/main/resources: Configuración y recursos
- src/test/java: Pruebas

## Requisitos
- Java 21
- Maven 3.6+

## Ejecución
```bash
mvn spring-boot:run
```

## Despliegue
Configura los perfiles y la base de datos en `src/main/resources/application-*.properties`.
