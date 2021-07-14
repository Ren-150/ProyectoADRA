<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link rel="stylesheet" href="recursos/css/estilos_login_main.css">
<link rel="stylesheet" href="recursos/css/estilos_funciones.css">
</head>
<body>
	<div class="main2">
		<nav class="navbar navbar-light"
			style="background: linear-gradient(to bottom right, rgb(6, 88, 47), rgb(10, 155, 54));">
			<img src="recursos/imagenes/logo.png" width="180" height="60"
				style="border-radius: 15px;"> <span id="mostraruser"
				class="navbar-brand mb-0 justify-content-center h3 text-white">
				<span id="user"></span><span id="rol" ></span></span>
		</nav>

		<div class="row extender" style="margin-right: 0px;">
			<div class="col-3 extender">
				<div class="menubar list-group">
					<a href="2_crearcapacitaciones.jsp"
						class="list-group-item list-group-item-action boton-bar"><i
						class="fa fa-book icon-right" aria-hidden="true"></i><b>CREAR
							CAPACITACIÓN</b></a> <a href="2_3_crearcategoria.jsp"
						class="list-group-item list-group-item-action boton-bar"><i
						class="fa fa-bookmark icon-right" aria-hidden="true"></i><b>CREAR
							CATEGORÍA</b></a> <a href="2_4_crearsesion.jsp"
						class="list-group-item list-group-item-action boton-bar"><i
						class="fa fa-folder icon-right" aria-hidden="true"></i><b>CREAR
							SESIÓN</b></a> <a href="main.jsp"
						class="list-group-item list-group-item-action boton-bar"><i
						class="fa fa-power-off icon-right" aria-hidden="true"></i><b>SALIR</b></a>
				</div>

			</div>

			<div class="col-9" style="padding: 20px;">
				<div id="mostrar">
					<div class="row">
						<div class="col-12">
							<div id="todo">
								<div class="formulario">
									<div class="header">REGISTRO DE CAPACITACION</div>
									<div class="cuerpo">
										<div class="form-group row">
											<label for="" class="col-sm-3 col-form-label">Nombre:</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" id="nom">
											</div>
										</div>

										<div class="form-group row">
											<label for="" class="col-sm-3 col-form-label">Fecha
												inicio:</label>
											<div class="col-sm-8">
												<input type="date" class="form-control" id="fecha_i">
											</div>
										</div>

										<div class="form-group row">
											<label for="" class="col-sm-3 col-form-label">Fecha
												cierre:</label>
											<div class="col-sm-8">
												<input type="date" class="form-control"
													id="fecha_c">
											</div>
										</div>

										<div class="form-group row">
											<label for="" class="col-sm-3 col-form-label">Cantidad
												horas:</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" id="cant">
											</div>
										</div>

										<div class="form-group row">
											<label for="" class="col-sm-3 col-form-label">Categoría:</label>
											<div class="col-sm-8">
												<select id="categ" class="form-control">
													<option>Seleccionar</option>
													<option>Salud</option>
													<option>Agropecuaria</option>
												</select>
											</div>
										</div>
										<div class="caja-botones d-flex">
											<button id="crear"
												class="btn btn-success tamanio-btn ml-auto">Crear</button>
										</div>
									</div>
								</div>
							</div>


						</div>
						<div class="col-11" style="padding: 30px; padding-top: 10px;">
							<h3>Capacitaciones</h3>
							<div class="row">
								<div class="col-6"></div>
								<div class="col-6"></div>
							</div>


							<input class="form-control mr-sm-2 light-table-filter"
								data-table="order-table" type="search" placeholder="Search"
								aria-label="Search">
							<table class="table table-bordered order-table"
								style="margin-top: 20px;" id="table">
								<thead>
									<tr>
										<th scope="col">ID</th>
										<th scope="col">Nombre</th>
										<th scope="col">Fecha Inicio</th>
										<th scope="col">Fecha Cierre</th>
										<th scope="col">Cantidad horas</th>
										<th scope="col">Categoría</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
						</div>
					</div>

				</div>

			</div>

		</div>

	</div>

	<script src="recursos/js/jquery-3.6.0.min.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script src="recursos/js/1_script.js"></script>
	<script src="recursos/js/script_capacitaciones.js"></script>
	<script src="recursos/js/script_salir.js"></script>
	
</body>
</html>