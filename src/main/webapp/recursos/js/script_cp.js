var nombre = document.getElementById("nom");
var fecha_in = document.getElementById("fecha_i");
var fecha_ci = document.getElementById("fecha_c");
var cant_h = document.getElementById("cant");
var cat = document.getElementById("categ");

var i = 0;
var j = 0;
var filita = "";
var estado = 0;

function crear(){  
    if(estado==0){
        alert("El registro se completó correctamente");
    var table = document.getElementById("table");
    var tbody = document.getElementById("tbd");
    var fila = document.createElement("tr");
    
    var celda_id = document.createElement("td");
    celda_id.innerHTML=j+=1;
    
    var celda_nombre = document.createElement("td");
    celda_nombre.innerHTML=nombre.value;
    
    var celda_fecha_in = document.createElement("td");
    celda_fecha_in.innerHTML=fecha_in.value;
    
    var celda_fecha_ci = document.createElement("td");
    celda_fecha_ci.innerHTML=fecha_ci.value;
    
    var celda_cant_h = document.createElement("td");
    celda_cant_h.innerHTML=cant_h.value;
    
    var celda_cat = document.createElement("td");
    celda_cat.innerHTML=cat.value;
    
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
    fila.appendChild(celda_fecha_in);
    fila.appendChild(celda_fecha_ci);
    fila.appendChild(celda_cant_h);
    fila.appendChild(celda_cat);
    
    fila.appendChild(celda_accion1);
    fila.appendChild(celda_accion2);
    
    tbody.appendChild(fila);
    
    table.appendChild(tbody);
    limpiar();
    i+=1;
    }else{
        filita.cells[1].innerHTML = nom.value;
        filita.cells[2].innerHTML = fecha_i.value;
        filita.cells[3].innerHTML = fecha_c.value;
        filita.cells[4].innerHTML = cant.value;
        filita.cells[5].innerHTML = categ.value;
        filita = "";
        limpiar();
        estado = 0;
    }
}
function limpiar(){
    nom.value="";
    fecha_i.value="";
    fecha_c.value="";
    cant.value="";
    categ.value="";
    nom.focus();
}
function editar(row){
   filita = row.parentNode.parentNode;  
   nom.value = filita.cells[1].innerHTML;
   fecha_i.value=filita.cells[2].innerHTML;
   fecha_c.value=filita.cells[3].innerHTML;
   cant.value=filita.cells[4].innerHTML;
   categ.value=filita.cells[5].innerHTML;
   estado = 1;
}
function eliminar(row){
    var fil = row.parentNode.parentNode;
    fil.parentNode.removeChild(fil);
}