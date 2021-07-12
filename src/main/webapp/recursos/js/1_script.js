var data = sessionStorage.getItem('user');

$("#user").html(data);

function pagina(n) {
    if (n == 1) {
        $("#mostrar").load("1.1_datos_cliente.html");
    }
    if (n == 2) {
        $("#mostrar").load("1.2_crear_usuario.html");
    }
    if (n == 3) {
        $("#mostrar").load("1.3_listar_usuarios.html");
    }
    if (n == 4) {
        $("#todo").load("examples.html");
    }
}