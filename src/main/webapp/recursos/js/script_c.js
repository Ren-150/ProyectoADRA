

var nombre = document.getElementById("nom");
var i = 0;
var j = 0;
var filita = "";
var estado = 0;
function crear(){  
    if(estado==0){
        alert("save");
    var table = document.getElementById("table");
    var tbody = document.getElementById("tbd");
    var fila = document.createElement("tr");
    
    var celda_id = document.createElement("td");
    celda_id.innerHTML=j+=1;
    
    var celda_nombre = document.createElement("td");
    celda_nombre.innerHTML=nombre.value;
    
    var celda_accion1 = document.createElement("td");
    celda_accion1.classList.add("accion1");
    celda_accion1.innerHTML=
    "<a href='#' onclick='editar(this)'><i class='fa fa-pencil-square fa-2' aria-hidden='true'></i></a>";
    
    
    var celda_accion2 = document.createElement("td");
    celda_accion2.classList.add("accion2");
    celda_accion2.innerHTML=
    "<a href='#' onclick='eliminar(this)'><i class='fa fa-times fa-2' aria-hidden='true'></a>";

    fila.appendChild(celda_id);
    fila.appendChild(celda_nombre);
    fila.appendChild(celda_accion1);
    fila.appendChild(celda_accion2);
    
    tbody.appendChild(fila);
    
    table.appendChild(tbody);
    limpiar();
    i+=1;
    }else{
        alert("editar");
        filita.cells[1].innerHTML = nom.value;
        filita = "";
        limpiar();
        estado = 0;
    }
}
function limpiar(){
    nom.value="";
    nom.focus();
}
function editar(row){
   filita = row.parentNode.parentNode;  
   nom.value = filita.cells[1].innerHTML;
   estado = 1;
}
function eliminar(row){
    var fil = row.parentNode.parentNode;
    fil.parentNode.removeChild(fil);
}