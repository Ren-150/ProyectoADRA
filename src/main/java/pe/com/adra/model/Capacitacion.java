package pe.com.adra.model;

public class Capacitacion {
    private int id_capacitacion;
    private String nombre;
    private String fecha_inicio;
    private String fecha_cierre;
    private int cantidad_horas;
    private int id_categoria;
    private int id_persona;
    
    
    public Capacitacion() {
    }

    
    public Capacitacion(int id_capacitacion, String nombre, String fecha_inicio, String fecha_cierre, int cantidad_horas, int id_categoria, int id_persona) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cierre = fecha_cierre;
        this.cantidad_horas = cantidad_horas;
        this.id_categoria = id_categoria;
        this.id_persona = id_persona;
    }
    
    
    
    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(String fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public int getCantidad_horas() {
        return cantidad_horas;
    }

    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    
    
    
}
