package pe.com.adra.model;

public class Respuesta {
    private int id_respuesta;
    private String descripcion;
    private int id_persona;
    private int id_enc_preg;

    public Respuesta() {
    }

    public Respuesta(int id_respuesta, String descripcion, int id_persona, int id_enc_preg) {
        this.id_respuesta = id_respuesta;
        this.descripcion = descripcion;
        this.id_persona = id_persona;
        this.id_enc_preg = id_enc_preg;
    }

    public int getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(int id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_enc_preg() {
        return id_enc_preg;
    }

    public void setId_enc_preg(int id_enc_preg) {
        this.id_enc_preg = id_enc_preg;
    }
    
    
}
