package pe.com.adra.model;

public class Tipo_recurso {
    private int id_tipo_recurso;
    private String nombre;

    public Tipo_recurso() {
    }

    public Tipo_recurso(int id_tipo_recurso, String nombre) {
        this.id_tipo_recurso = id_tipo_recurso;
        this.nombre = nombre;
    }

    public int getId_tipo_recurso() {
        return id_tipo_recurso;
    }

    public void setId_tipo_recurso(int id_tipo_recurso) {
        this.id_tipo_recurso = id_tipo_recurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
