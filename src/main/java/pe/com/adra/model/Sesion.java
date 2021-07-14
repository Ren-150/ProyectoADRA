package pe.com.adra.model;

public class Sesion {
    private int id_sesion;
    private String tema; 
    private String objetivo;
    private int id_capacitacion;

    public Sesion() {
    }

    public Sesion(String tema, String objetivo, int id_capacitacion) {
        this.tema = tema;
        this.objetivo = objetivo;
        this.id_capacitacion = id_capacitacion;
    }

    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }
    
    
    
    
}
