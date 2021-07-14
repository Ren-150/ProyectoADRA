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
				style="border-radius: 15px;"> <span id="user"
				class="navbar-brand mb-0 justify-content-center h3 text-white">
				<span id="user"></span> - <span id="rol" ></span></span>
		</nav>

		<div class="row extender" style="margin-right: 0px;">
			<div class="col-3 extender">
				<div class="menubar list-group">
					 <a href="1_crearusuarios.jsp"
						class="list-group-item list-group-item-action boton-bar"><i
						class="fa fa-user-plus icon-right" aria-hidden="true"></i><b>CREAR
							USUARIOS</b></a>
						<a href="main.jsp"
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
									<div class="header">REGISTRO DE USUARIO</div>
									<div class="cuerpo">
										<div class="row">
											<div class="col-6">
												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Nombre:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="nom">
													</div>
												</div>

												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Apellido
														paterno:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="apepat">
													</div>
												</div>

												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Apellido
														materno:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control"
															id="apemat">
													</div>
												</div>

												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Correo
														electrónico:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="correo">
													</div>
												</div>

												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">DNI:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="dni">
													</div>
												</div>
											</div>
											<div class="col-6">
												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Usuario:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="user">
													</div>
												</div>

												<div class="form-group row">
													<label for="" class="col-sm-3 col-form-label">Contraseña:</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" id="pass">
													</div>
												</div>
												<div class="caja-botones d-flex">
													<button id="crear1" class="btn btn-success  ml-auto">Crear Cliente</button>
													<button id="crear2" class="btn btn-success  ml-auto">Crear Usuario</button>
													
													<button id="enviar" class="btn btn-success  ml-auto">Enviar
														cuentas</button>
													<input type="hidden" class="form-control"	id="id1" value="0" />
													<input type="hidden" class="form-control"	id="id2" value="0" />
													
												</div>
												
											</div>




										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-11" style="padding: 30px; padding-top: 10px;">
							<h3>Clientes</h3>
							<div class="row">
								<div class="col-6"></div>
								<div class="col-6"></div>
							</div>


							<input class="form-control mr-sm-2 light-table-filter"
								data-table="order-table" type="search" placeholder="Search"
								aria-label="Search">
							<table class="table table-bordered order-table"
								style="margin-top: 20px;" id="table1">
								<thead>
									<tr>
										<th scope="col">ID</th>
										<th scope="col">Nombre</th>
										<th scope="col">Apellido Paterno</th>
										<th scope="col">Apellido Materno</th>
										<th scope="col">Correo electrónico</th>
										<th scope="col">DNI</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
						</div>
						
						<div class="col-11" style="padding: 30px; padding-top: 10px;">
							<h3>Usuarios</h3>
							<div class="row">
								<div class="col-6"></div>
								<div class="col-6"></div>
							</div>


							<input class="form-control mr-sm-2 light-table-filter"
								data-table="order-table" type="search" placeholder="Search"
								aria-label="Search">
							<table class="table table-bordered order-table"
								style="margin-top: 20px;" id="table2">
								<thead>
									<tr>
										<th scope="col">ID</th>
										<th scope="col">Usuario</th>
										<th scope="col">Contraseña</th>
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
	<script src="recursos/js/script_personas.js"></script>
	<script src="recursos/js/script_usuarios.js"></script>
	<script src="recursos/js/script_salir.js"></script>
</body>
</html>