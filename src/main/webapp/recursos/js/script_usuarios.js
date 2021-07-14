$(document).ready(function(){
	listar();
	limpiar();
	
});

function listar(){
	$.get("cdc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#table tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].id_persona+"</td><td>"+x[i].nombre_usuario+"</td><td>"+x[i].contrasenia+"</td><td>"+x[i].estado+"</td><td><a href='#' onclick='editar("+x[i].id_persona+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].id_persona+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#crear2").click(function(){
	var idc = $("#id2").val();
	if(idc==0){
	var param = {"nombre_usuario":$("#user").val(), "contrasenia":$("#pass").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'cdc',
		type: 'POST',
		success: function(response){
			alert(response);
			limpiar();
			listar();
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});
	}else{
		alert($("#id2").val()+"/"+$("#nom").val());
		$.post("cdc",{"id":$("#id2").val(),"nombre_usuario":$("#user").val(), "contrasenia":$("#pass").val(),"opc":4},function (data) {
		listar();
		limpiar();
    });
	}
});

function editar(id){
	$("#crear2").html("Editar");
	$.get("cdc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
		$("#id2").val(x.id_persona)
		$("#user").val(x.nombre_usuario)
		$("#pass").val(x.contrasenia);
    });
}
function eliminar(id){
	$.get("cdc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#id2").val(0);
	$("#user").val("");
	$("#pass").val("");
	$("#crear2").html("Crear Usuario");
}