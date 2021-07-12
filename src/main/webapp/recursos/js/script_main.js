var data = sessionStorage.getItem('user');

$("#user").html(data);

$("#salir").click(function (e) {
    e.preventDefault();
    window.location = 'login.html';
});

/*-------Funciones-------*/

$("#op1").click(function (e) { 
    e.preventDefault();
    window.location = 'funciones/1_crear_usuario.html';
});

$("#op2").click(function (e) { 
    e.preventDefault();
    window.location = 'funciones/2_crear_capacit.html';
});

$("#op3").click(function (e) { 
    e.preventDefault();
    window.location = 'funciones/3_control_capacit.html';
});