package pe.com.adra.model;

public class Banco_comunal {
    private int id_banco_comunal;
    private String nombre;
    private String direccion;
    private String telefono;

    public Banco_comunal() {
    }

    public Banco_comunal(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
 
       
    
    public int getId_banco_comunal() {
        return id_banco_comunal;
    }

    public void setId_banco_comunal(int id_banco_comunal) {
        this.id_banco_comunal = id_banco_comunal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
