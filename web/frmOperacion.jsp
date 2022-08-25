<%@page import="java.util.ArrayList"%>
<%@page import="pruebasunitariasweb.classes.Operacion"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/Biblioteca.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>

    <body>
        <h1>Formulario de Operaciones</h1>
        <hr>
        <form action="Operacion" method="post" name="frmOperacion">
            <label for="txtN1">Numero 1:</label><input type="number" name="txtN1" id="txtN1"><br>
            <label for="txtN2">Numero 2:</label><input type="number" name="txtN2" id="txtN2"><br>
            <label for="txtSum">Suma:</label><input type="text" name="txtSum" id="txtSum" readonly value=""><br>
            <label for="txtRes">Resta:</label><input type="text" name="txtRes" id="txtRes" readonly value=""><br>
            <label for="txtMul">Multiplicacion:</label><input type="text" name="txtMul" id="txtMul" readonly value=""><br>
            <label for="txtDiv">Division</label><input type="text" name="txtDiv" id="txtDiv" readonly value=""><br>
            <button class="btn btn-primary" id="btnCalcular" name="btnCalcular" type="button" onclick="Validar()">Calcular</button>
        </form>
    </body>

</html>