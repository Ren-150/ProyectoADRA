$(document).ready(function(){
	listar();
	limpiar();
	
});

function listar(){
	$.get("cc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#table tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#table").append("<tr><td>"+(i+1)+"</td><td>"+x[i].id_categoria+"</td><td>"+x[i].nombre+"</td><td><a href='#' onclick='editar("+x[i].id_categoria+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].id_categoria+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#registrar").click(function(){
	var idr = $("#id").val();
	if(idr==0){
	var param = {"nombre":$("#nom").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'cc',
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
		alert($("#id").val()+"/"+$("#nom").val());
		$.post("cc",{"id":$("#id").val(),"nombre":$("#nom").val(),"opc":4},function (data) {
		listar();
		limpiar();
    });
	}
});

function editar(id){
	$("#registrar").html("Editar");
	$.get("cc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
		$("#id").val(x.id_categoria)
		$("#nom").val(x.nombre);
    });
}
function eliminar(id){
	$.get("cc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#id").val(0);
	$("#nom").val("");
	$("#registrar").html("Registrar");
}