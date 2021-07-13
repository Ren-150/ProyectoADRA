var username = "Renzo";
var password = "1234";
var rol = "Administrador";

$("#boton").click(function (e) {
    e.preventDefault();

    var user = $("#username").val();
    var pass = $("#password").val();
    if (user == username && pass == password) {
        sessionStorage.setItem('user',user);
        sessionStorage.setItem('rol',rol);
        window.location = 'main.jsp';
    } else {
        alert("Nombre o contraseña incorrecta")
        window.location = 'index.html';
    }

});

