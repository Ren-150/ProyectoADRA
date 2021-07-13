var data = sessionStorage.getItem('user');

$("#user").html(data);

function pagina(n) {
    if (n == 1) {
        $("#mostrar").load("1_2_listarclientes.jsp");
    }
    if (n == 2) {
        $("#mostrar").load("1_1_crearusuarios.jsp");
    }
    if (n == 3) {
        $("#mostrar").load("1_3_listarusuarios.jsp");
    }
    if (n == 4) {
        $("#todo").load("examples.html");
    }
    
    $('#click').click(function() {
           updateSubContent("views/1_2_listarclientes.jsp");
    });
}