package pe.com.adra.model;

public class Pregunta {
    private int id_pregunta;
    private String nombre;

    public Pregunta() {
    }

    public Pregunta(int id_pregunta, String nombre) {
        this.id_pregunta = id_pregunta;
        this.nombre = nombre;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

}
