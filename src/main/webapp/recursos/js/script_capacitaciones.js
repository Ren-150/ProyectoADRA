$(document).ready(function(){
	listar();
	limpiar();
	
});

function listar(){
	$.get("cpc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#table tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#table").append("<tr><td>"+(i+1)+"</td><td>"+x[i].id_capacitacion+"</td><td>"+x[i].nombre+"</td><td>"+x[i].fecha_inicio+"</td><td>"+x[i].fecha_cierre+"</td><td>"+x[i].cantidad_horas+"</td><td>"+x[i].id_categoria+"</td><td><a href='#' onclick='editar("+x[i].id_capacitacion+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].id_capacitacion+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}

$("#registrar").click(function(){
	var idc = $("#id").val();
	if(idc==0){
	var param = {"nombre":$("#nom").val(), "fecha_inicio":$("#fecha_i").val(), "fecha_cierrre":$("#fecha_c").val(), "cantidad_horas":$("#cant").val(), "id_categoria":$("#categ").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'cpc',
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
		$.post("cpc",{"id":$("#id").val(),"nombre":$("#nom").val(), "fecha_inicio":$("#fecha_i").val(), "fecha_cierrre":$("#fecha_c").val(), "cantidad_horas":$("#cant").val(), "id_categoria":$("#categ").val(),"opc":4},function (data) {
		listar();
		limpiar();
    });
	}
});

function editar(id){
	$("#registrar").html("Editar");
	$.get("cpc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
		$("#id").val(x.id_categoria)
		$("#fecha_i").val(x.fecha_inicio)
		$("#fecha_c").val(x.fecha_cierre)
		$("#cant").val(x.cantidad_horas)
		$("#categ").val(x.categoria);
    });
}
function eliminar(id){
	$.get("cpc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#id").val(0);
	$("#fecha_i").val("");
	$("#fecha_c").val("");
	$("#cant").val(0);
	$("#categ").val(0);
	$("#crear").html("Crear");
}