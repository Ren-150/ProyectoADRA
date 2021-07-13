<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link rel="stylesheet" href="recursos/css/estilos_login_main.css">
<link rel="stylesheet" href="recursos/css/estilos_funciones.css">
</head>
<body>
	<div class="main2">
        <nav class="navbar navbar-light"
            style="background: linear-gradient(to bottom right, rgb(6, 88, 47), rgb(10, 155, 54));">
            <img src="recursos/imagenes/logo.png" width="180" height="60" style="border-radius: 15px;">

            <span id="mostraruser" class="navbar-brand mb-0 justify-content-center h3 text-white"> Nombre -
                Rol</span>
        </nav>

        <div class="row extender" style="margin-right: 0px;">
            <div class="col-3 extender">
                <div class="menubar list-group">
                    <button type="button" class="list-group-item list-group-item-action boton-bar"><i
                            class="fa fa-address-book icon-right" aria-hidden="true"></i><b>LISTAR
                            ASISTENCIAS</b></button>
                    <button type="button" class="list-group-item list-group-item-action boton-bar"><i
                            class="fa fa-address-book icon-right" aria-hidden="true"></i><b>GENERAR REPORTE</b></button>
                    <button id="salir" type="button" class="list-group-item list-group-item-action boton-bar"><i
                            class="fa fa-power-off icon-right" aria-hidden="true"></i><b>SALIR</b></button>
                </div>

            </div>

            <div class="col-9" style="padding: 20px;">


            </div>

        </div>

    </div>

	<script src="recursos/js/jquery-3.6.0.min.js"></script>
    <script src="recursos/js/bootstrap.min.js"></script>
    <script src="recursos/js/1_script.js"></script>
    <script src="recursos/js/script_salir.js"></script>
</body>
</html>