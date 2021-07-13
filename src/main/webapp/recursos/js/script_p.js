var nombre = document.getElementById("nom");
var apepater = document.getElementById("apepat");
var apemater = document.getElementById("apemat");
var correo = document.getElementById("correo");
var dni = document.getElementById("dni");
var user = document.getElementById("user");
var password = document.getElementById("pass");

var i = 0;
var j = 0;
var k = 0;

var filita1 = "";
var filita2 = "";

var estado1 = 0;
var estado2 = 0;

function crear1(){  
    if(estado1==0){
        alert("El registro se completo correctamente");
        
    var table1 = document.getElementById("table1");
    
    var tbody1 = document.getElementById("tbd1");
    
    var fila1 = document.createElement("tr");
    
    var celda_id1 = document.createElement("td");
    celda_id1.innerHTML=j+=1;
    
    var celda_nombre = document.createElement("td");
    celda_nombre.innerHTML=nombre.value;
    
    var celda_apepater = document.createElement("td");
    celda_apepater.innerHTML=apepater.value;
    
    var celda_apemater = document.createElement("td");
    celda_apemater.innerHTML=apemater.value;
    
    var celda_correo = document.createElement("td");
    celda_correo.innerHTML=correo.value;
    
    var celda_dni = document.createElement("td");
    celda_dni.innerHTML=dni.value;
    
    var celda_accion1 = document.createElement("td");
    celda_accion1.classList.add("accion1");
    celda_accion1.innerHTML=
    "<a href='#' onclick='editar1(this)'><i class='fa fa-pencil-square fa-2' aria-hidden='true'></i></a>";
    
    var celda_accion2 = document.createElement("td");
    celda_accion2.classList.add("accion2");
    celda_accion2.innerHTML=
    "<a href='#' onclick='eliminar1(this)'><i class='fa fa-times fa-2' aria-hidden='true'></a>";
    
    
    fila1.appendChild(celda_id1);
    fila1.appendChild(celda_nombre);
    fila1.appendChild(celda_apepater);
    fila1.appendChild(celda_apemater);
    fila1.appendChild(celda_correo);
 	fila1.appendChild(celda_dni);
    fila1.appendChild(celda_accion1);
    fila1.appendChild(celda_accion2);
    
    
    tbody1.appendChild(fila1);
    
    table1.appendChild(tbody1);
    
    limpiar1();
    i+=1;
    }else{
        filita1.cells[1].innerHTML = nom.value;
        filita1.cells[2].innerHTML = apepat.value;
        filita1.cells[3].innerHTML = apemat.value;
        filita1.cells[4].innerHTML = correo.value;
        filita1.cells[5].innerHTML = dni.value;
        
        filita1 = "";
        limpiar1();
        estado1 = 0;
    }
}


function limpiar1(){
    nom.value="";
    apepat.value="";
    apemat.value="";
    correo.value="";
    dni.value="";
    nom.focus();
}
function editar1(row){
   filita1 = row.parentNode.parentNode;
   
   nom.value=filita1.cells[1].innerHTML;
   apepat.value=filita1.cells[2].innerHTML;
   apemat.value=filita1.cells[3].innerHTML;
   correo.value=filita1.cells[4].innerHTML;
   dni.value=filita1.cells[5].innerHTML;
   
   estado1 = 1;

}
function eliminar1(row){
    var fil = row.parentNode.parentNode;
    fil.parentNode.removeChild(fil);
}






function crear2(){  
    if(estado2==0){
        alert("El registro se completo correctamente");
    var table2 = document.getElementById("table2");
    
    var tbody2 = document.getElementById("tbd2");
    
    var fila2 = document.createElement("tr");
    
    
    var celda_id2 = document.createElement("td");
    celda_id2.innerHTML=k+=1;
    
    var celda_user = document.createElement("td");
    celda_user.innerHTML=user.value;
    
    var celda_password = document.createElement("td");
    celda_password.innerHTML=password.value;
    
    var celda_accion1 = document.createElement("td");
    celda_accion1.classList.add("accion1");
    celda_accion1.innerHTML=
    "<a href='#' onclick='editar2(this)'><i class='fa fa-pencil-square fa-2' aria-hidden='true'></i></a>";
    
    var celda_accion2 = document.createElement("td");
    celda_accion2.classList.add("accion2");
    celda_accion2.innerHTML=
    "<a href='#' onclick='eliminar2(this)'><i class='fa fa-times fa-2' aria-hidden='true'></a>";
   
    
    fila2.appendChild(celda_id2);
    fila2.appendChild(celda_user);
    fila2.appendChild(celda_password);
    fila2.appendChild(celda_accion1);
    fila2.appendChild(celda_accion2);
    
    tbody2.appendChild(fila2);
    
    table2.appendChild(tbody2);
    
    limpiar2();
    i+=1;
    }else{
        
        filita2.cells[1].innerHTML = user.value;
        filita2.cells[2].innerHTML = pass.value;
        
        filita2 = "";
        limpiar();
        estado2 = 0;
    }
}


function limpiar2(){
    user.value="";
    pass.value="";
    user.focus();
}
function editar2(row){
   filita2 = row.parentNode.parentNode;
   
   user.value=filita2.cells[1].innerHTML;
   pass.value=filita2.cells[2].innerHTML;
   estado2 = 1;
}
function eliminar2(row){
    var fil = row.parentNode.parentNode;
    fil.parentNode.removeChild(fil);
}