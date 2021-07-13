var tema = document.getElementById("tema");
var objetivo = document.getElementById("obj");
var capacit = document.getElementById("capac");

var i = 0;
var j = 0;
var filita = "";
var estado = 0;

function crear(){  
    if(estado==0){
        alert("El registro se completo correctamente");
    var table = document.getElementById("table");
    var tbody = document.getElementById("tbd");
    var fila = document.createElement("tr");
    
    var celda_id = document.createElement("td");
    celda_id.innerHTML=j+=1;
    
    var celda_tema = document.createElement("td");
    celda_tema.innerHTML=tema.value;
    
    var celda_objetivo = document.createElement("td");
    celda_objetivo.innerHTML=objetivo.value;
    
    var celda_capacit = document.createElement("td");
    celda_capacit.innerHTML=capacit.value;
    
    var celda_accion1 = document.createElement("td");
    celda_accion1.classList.add("accion1");
    celda_accion1.innerHTML=
    "<a href='#' onclick='editar(this)'><i class='fa fa-pencil-square fa-2' aria-hidden='true'></i></a>";
    
    var celda_accion2 = document.createElement("td");
    celda_accion2.classList.add("accion2");
    celda_accion2.innerHTML=
    "<a href='#' onclick='eliminar(this)'><i class='fa fa-times fa-2' aria-hidden='true'></a>";

    fila.appendChild(celda_id);
    fila.appendChild(celda_tema);
    fila.appendChild(celda_objetivo);
    fila.appendChild(celda_capacit);
 
    fila.appendChild(celda_accion1);
    fila.appendChild(celda_accion2);
    
    tbody.appendChild(fila);
    
    table.appendChild(tbody);
    limpiar();
    i+=1;
    }else{
        filita.cells[1].innerHTML = tema.value;
        filita.cells[2].innerHTML = obj.value;
        filita.cells[3].innerHTML = capac.value;
        filita = "";
        limpiar();
        estado = 0;
    }
}
function limpiar(){
    tema.value="";
    obj.value="";
    capac.value="";
    tema.focus();
}
function editar(row){
   filita = row.parentNode.parentNode;  
   tema.value = filita.cells[1].innerHTML;
   obj.value=filita.cells[2].innerHTML;
   capac.value=filita.cells[3].innerHTML;
   estado = 1;
}
function eliminar(row){
    var fil = row.parentNode.parentNode;
    fil.parentNode.removeChild(fil);
}