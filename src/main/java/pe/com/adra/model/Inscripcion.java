package pe.com.adra.model;

public class Inscripcion {
    private int id_inscripcion;
    private String fecha;
    private int id_persona;
    private int id_capacitacion;

    public Inscripcion() {
    }

    public Inscripcion(int id_inscripcion, String fecha, int id_persona, int id_capacitacion) {
        this.id_inscripcion = id_inscripcion;
        this.fecha = fecha;
        this.id_persona = id_persona;
        this.id_capacitacion = id_capacitacion;
    }

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }
    
    
    

}
