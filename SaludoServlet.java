<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Saludo</title>
</head>
<body>
    <form action="SaludoServlet" method="post">
        <label>Nombre:</label>
        <input type="text" name="nombre" required><br>

        <label>Apellido:</label>
        <input type="text" name="apellido" required><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
