var data = sessionStorage.getItem('user');
var rol = sessionStorage.getItem('rol');

$("#user").html(data);
$("#rol").html(rol);

$("#salir").click(function (e) {
    e.preventDefault();
    window.location = 'index.html';
});

/*-------Funciones-------*/

$("#op1").click(function (e) { 
    e.preventDefault();
    window.location.href = '1_crearusuarios.jsp';
});

$("#op2").click(function (e) { 
    e.preventDefault();
    window.locatio.href = '2_crearcapacitaciones.jsp';
});

$("#op3").click(function (e) { 
    e.preventDefault();
    window.location.href = '3_control_capacit.jsp';
});