<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login - Gestión UGR SDA</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <style>
        body {
            background: linear-gradient(135deg, #a50034 0%, #fff 100%);
            min-height: 100vh;
        }
        .login-container {
            max-width: 400px;
            margin: 60px auto;
            background: #fff;
            border-radius: 16px;
            box-shadow: 0 4px 24px rgba(0,0,0,0.12);
            padding: 2rem 2.5rem 2rem 2.5rem;
        }
        .login-logos {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 1rem;
        }
        .login-logo {
            width: 90px;
            height: auto;
        }
        .login-title {
            color: #a50034;
            font-weight: bold;
            text-align: center;
            margin-bottom: 1.5rem;
        }
    </style>
</head>
<body>
<div class="login-container">
    <div class="login-logos">
        <img src="/images/2018_h_logougr.jpg" alt="UGR Logo" class="login-logo">
        <img src="/images/2018_h_logocsirc.jpg" alt="Servicio Informática Logo" class="login-logo">
    </div>
    <h2 class="login-title">Gestión UGR de SDA</h2>
    <form method="post" action="/login">
        <div class="mb-3">
            <label for="username" class="form-label">Usuario</label>
            <input type="text" class="form-control" id="username" name="username" required autofocus>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Contraseña</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>
        <button type="submit" class="btn btn-primary w-100" style="background-color:#a50034;border:none;">Entrar</button>
    </form>
</div>
<script src="/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
