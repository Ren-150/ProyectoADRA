$(document).ready(function(){
	listar();
	limpiar();
	
});

function listar(){
	$.get("pc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#table1 tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#table1").append("<tr><td>"+(i+1)+"</td><td>"+x[i].id_persona+"</td><td>"+x[i].nombre+"</td><td>"+x[i].apellido_pat+"</td><td>"+x[i].apellido_mat+"</td><td>"+x[i].correo_electronico+"</td><td>"+x[i].dni+"</td><td><a href='#' onclick='editar("+x[i].id_persona+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].id_persona+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#crear2").click(function(){
	var idp = $("#id1").val();
	if(idp==0){
	var param = {"nombre":$("#nom").val(), "apellido_pat":$("#apepat").val(), "apellido_mat":$("#apemat").val(), "correo_electronico":$("#correo").val(), "dni":$("#dni").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'pc',
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
		alert($("#id1").val()+"/"+$("#nom").val());
		$.post("pc",{"id":$("#id1").val(),"nombre":$("#nom").val(), "apellido_pat":$("#apepat").val(), "apellido_mat":$("#apemat").val(), "correo_electronico":$("#correo").val(), "dni":$("#dni").val(),"opc":4},function (data) {
		listar();
		limpiar();
    });
	}
});

function editar(id){
	$("#crear1").html("Editar");
	$.get("pc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
		$("#id1").val(x.id_persona)
		$("#nom").val(x.nombre)
		$("#apepat").val(x.apellido_pat)
		$("#apemat").val(x.apellido_mat)
		$("#correo").val(x.correo_electronico)
		$("#dni").val(x.dni);
    });
}
function eliminar(id){
	$.get("pc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#id1").val(0);
	$("#nom").val("");
	$("#apepat").val("");
	$("#apemat").val("");
	$("#correo").val("");
	$("#dni").val("");
	$("#crear1").html("Crear Cliente");
}