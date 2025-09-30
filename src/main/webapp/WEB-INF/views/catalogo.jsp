<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Catálogo de Productos y Servicios - UGR SDA</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <style>
        .navbar-ugr { background-color: #a50034; }
        .navbar-title { color: #fff; font-weight: bold; }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-ugr">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="/logo-ugr.png" alt="UGR" width="40" height="40" class="d-inline-block align-text-top">
        </a>
        <span class="navbar-title">Catálogo de Productos y Servicios</span>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link text-white" href="/">Inicio</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="/login">Gestión</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-4">
    <h1>Catálogo de Productos y Servicios</h1>
    <div id="catalogo-lista">
        <!-- Aquí se mostrarán los productos y servicios -->
        <jsp:useBean id="productos" scope="request" type="java.util.List" />
        <c:forEach var="producto" items="${productos}">
            <div class="card mb-3">
                <div class="card-body">
                    <h5 class="card-title">${producto.nombre}</h5>
                    <p class="card-text">${producto.descripcion}</p>
                    <p class="card-text"><strong>Precio:</strong> ${producto.precio} €</p>
                    <p class="card-text"><strong>Categoría:</strong> ${producto.categoria}</p>
                    <p class="card-text"><strong>Disponible:</strong> <span class="badge bg-${producto.disponible ? 'success' : 'danger'}">${producto.disponible ? 'Sí' : 'No'}</span></p>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<script src="/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
