package pe.com.adra.model;

public class Recurso {
    private int id_recurso;
    private String nombre;
    private int id_clase;
    private int id_tipo_recurso;

    public Recurso() {
    }

    public Recurso(int id_recurso, String nombre, int id_clase, int id_tipo_recurso) {
        this.id_recurso = id_recurso;
        this.nombre = nombre;
        this.id_clase = id_clase;
        this.id_tipo_recurso = id_tipo_recurso;
    }

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public int getId_tipo_recurso() {
        return id_tipo_recurso;
    }

    public void setId_tipo_recurso(int id_tipo_recurso) {
        this.id_tipo_recurso = id_tipo_recurso;
    }
    
    
    
}
