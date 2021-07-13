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
<style>
	#asidebar{
    background-image: url("recursos/imagenes/Fondo2.jpg");
    background-size: cover;
    }
    #section{
    background-image: url("recursos/imagenes/Fondo3.jpg");
    background-size: cover;
    }
</style>
</head>
<body>
<div class="container-fluid">
        <div class="row">
            
            <%@include file="WEB-INF/templates/barradeusuario.jspf" %>
            
            <div id="section" class="col-9">
                <a id="" href="1_crearusuarios.jsp">
                	<div class="card sombra-suave" style="width: 12rem; height: 11rem; text-align: center;">
                        <img class="img-opcion" src="recursos/imagenes/opc1.jpg" alt="...">
                        <div class="card-body">
                            <h6 class="card-title">Crear Usuario</h6>
                        </div>
                    </div>
                </a>
                    
                <a id="" href="2_crearcapacitaciones.jsp">
                    <div class="card sombra-suave" style="width: 12rem; height: 11rem; text-align: center;">
                        <img class="img-opcion" src="recursos/imagenes/opc2.png" alt="...">
                        <div class="card-body">
                            <h6 class="card-title">Crear Capacitacion</h6>
                        </div>
                    </div>
                </a>

                <a id="" href="3_control_capacit.jsp">
                    <div class="card sombra-suave" style="width: 12rem; height: 11rem; text-align: center;">
                        <img class="img-opcion" src="recursos/imagenes/opc6.png" alt="...">
                        <div class="card-body">
                            <h6 class="card-title">Reportes</h6>
                        </div>
                    </div>
                </a>

            </div>
        </div>
    </div>
    
    <script src="recursos/js/jquery-3.6.0.min.js"></script>
    <script src="recursos/js/bootstrap.min.js"></script>
    <script src="recursos/js/script_main.js"></script>
</body>
</html>