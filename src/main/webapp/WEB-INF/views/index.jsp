<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Gestión UGR de SDA</title>
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
        <span class="navbar-title">Gestión UGR de Servicio Dinámico de Adquisición</span>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link text-white" href="/">Catálogo</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="/login">Gestión</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-4">
    <h1>Bienvenido a la Gestión UGR de SDA</h1>
    <p>Accede al <a href="/">catálogo de productos y servicios</a> o <a href="/login">inicia sesión</a> para gestionar la plataforma.</p>
</div>
<script src="/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
