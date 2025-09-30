
# Descripción de la aplicación
Nombre: Gestión UGR de Servicio Dinámico de Adquisición

## Resumen
Se trata de una aplicación web que está orientada a que los usuarios puedan visualizar los posibles servicios y productos que ofrece la Universidad de Granada en un sistema dinámico de adquisición (SDA). El usuario podrá visualizar los productos y servicios, que estarán organizados por categorías, y podrá filtrar los productos y servicios en función de diferentes criterios. Además, el usuario podrá ver los detalles de cada producto o servicio, así como su disponibilidad y precio.

## Funcionalidades principales
- Visualización de productos y servicios: El usuario podrá ver una lista de los productos y servicios disponibles en el SDA, organizados por categorías.
- Filtrado y búsqueda: El usuario podrá filtrar los productos y servicios en función de diferentes criterios, como categoría, precio, disponibilidad, etc. También podrá buscar productos y servicios por nombre o descripción.
- Detalles del producto o servicio: El usuario podrá ver los detalles de cada producto o servicio, incluyendo su descripción, precio, disponibilidad, y cualquier otra información relevante.
- Gestión de usuarios: La aplicación contará con un sistema de gestión de usuarios, donde los usuarios podrán registrarse, iniciar sesión, y gestionar su perfil, con los datos de apellidos, nombre, datos de acceso (usuario y contraseña), fechas de inicio y fin (para deshabilitar usuarios).
- Administración de productos y servicios: Los administradores podrán añadir, editar, y eliminar productos y servicios en el SDA.
- Notificaciones: Los usuarios podrán recibir notificaciones sobre nuevos productos o servicios, cambios en la disponibilidad, etc. También podrán gestionar dichas notificaciones, deshabilitándolas en su caso, o programando los avisos.
- Soporte y ayuda: La aplicación contará con una sección de soporte y ayuda, donde los usuarios podrán encontrar respuestas a preguntas frecuentes y contactar con el soporte si es necesario.

## Tecnologías utilizadas
- Frontend: Bootstrap (mínimo versión 5).
- Backend: Spring Boot.
- Base de datos: H2 (para desarrollo) y Oracle (para preproducción y producción). En los entornos de preproducción y producción, al ser una base de datos Oracle, necesitamos que las operaciones contra la base de datos se gestionen mediante un pool de conexiones.
- Control de versiones: Git.
- Gestión de proyectos: Maven.

## Estructura del proyecto
- src/main/java: Código fuente de la aplicación, diferenciando las capas de un modelo vista controlador, como son: 
    * la capa modelo (donde trasladamos la estructura de las clases principales), 
    * la capa controlador, que se compondrá de:
        - la capa servicio (donde especificamos las posibles funcionalidades, junto con sus restricciones, y hacemos las llamadas correspondientes a la capa repositorio), 
        - la capa repositorio (donde implementamos las operaciones contra la base de datos),
        - la capa controlador (donde creamos las posibles interacciones de los usuarios, utilizando la capa servicio)
    * la capa vista (donde creamos la interfaz de usuario)
- src/main/webapp: Para las vistas o interfaces necesarias para la aplicación
- src/main/resources: Recursos estáticos y archivos de configuración
- src/test/java: Pruebas unitarias y de integración
- pom.xml: Archivo de configuración de Maven
- README.md: Documentación del proyecto

## Requisitos del sistema
- Java 21
- Maven 3.6 o superior
- Navegador web moderno (Chrome, Firefox, Edge, etc.)

## Aspecto visual de la interfaz
La interfaz de usuario de la aplicación estará diseñada para ser intuitiva y fácil de usar, además de ser responsiva para dispositivos diferentes. Se utilizarán colores y tipografías que sean agradables a la vista y que faciliten la lectura. La navegación será sencilla, con menús claros y accesibles. Se prestará especial atención a la experiencia del usuario, asegurando que todas las funcionalidades sean fáciles de encontrar y utilizar.

En la parte de arriba de la aplicación, se pondrá una barra de navegación con el logo de la Universidad de Granada a la izquierda y un menú de opciones a la derecha. El menú incluirá opciones como "Inicio", "Productos y Servicios", "Mi Perfil", "Soporte", y "Cerrar Sesión" (si el usuario ha iniciado sesión).

También la parte de arriba se pondrá una barra de color rojo (color corporativo de la UGR) que contendrá el título de la aplicación "Gestión UGR de Servicio Dinámico de Adquisición".