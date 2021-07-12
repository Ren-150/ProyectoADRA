var username = "Renzo";
var password = "1234";

$("#boton").click(function (e) {
    e.preventDefault();

    var user = $("#username").val();
    var pass = $("#password").val();
    if (user == username && pass == password) {
        sessionStorage.setItem('user',user);
        window.location = 'main.html';
    } else {
        alert("Nombre o contraseña incorrecta")
        window.location = 'login.html';
    }

});