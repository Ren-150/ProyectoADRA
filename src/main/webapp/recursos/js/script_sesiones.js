$(document).ready(function(){
	listar();
	limpiar();
	
});

function listar(){
	$.get("sc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#table tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#table").append("<tr><td>"+(i+1)+"</td><td>"+x[i].id_sesion+"</td><td>"+x[i].tema+"</td><td>"+x[i].objetivo+"</td><td>"+x[i].id_capacitacion+"</td><td><a href='#' onclick='editar("+x[i].id_sesion+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].id_sesion+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#registrar").click(function(){
	var ids = $("#id").val();
	if(ids==0){
	var param = {"tema":$("#tem").val(), "objetivo":$("#obj").val(), "id_capacitacion":$("#capac").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'sc',
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
		alert($("#id").val()+"/"+$("#tem").val());
		$.post("sc",{"id":$("#id").val(),"tema":$("#tem").val(), "objetivo":$("#obj").val(), "id_capacitacion":$("#capac").val(),"opc":4},function (data) {
		listar();
		limpiar();
    });
	}
});

function editar(id){
	$("#crear").html("Editar");
	$.get("sc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
		$("#id").val(x.id_sesion)
		$("#tem").val(x.tema)
		$("#obj").val(x.objetivo)
		$("#capac").val(x.id_capacitacion);
    });
}
function eliminar(id){
	$.get("sc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#id").val(0);
	$("#tem").val("");
	$("#obj").val("");
	$("#capac").val(0);
	$("#crear").html("Crear");
}