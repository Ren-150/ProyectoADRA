package pe.com.adra.model;

public class Asistencia {
    private int id_asistencia;
    private char estado;
    private int id_persona;
    private int id_recurso;

    public Asistencia() {
    }

    public Asistencia(char estado, int id_persona, int id_recurso) {
        this.estado = estado;
        this.id_persona = id_persona;
        this.id_recurso = id_recurso;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    
    
}
