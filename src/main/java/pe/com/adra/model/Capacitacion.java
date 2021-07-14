package pe.com.adra.model;

public class Capacitacion {
    private int id_capacitacion;
    private String nombre;
    private String fecha_inicio;
    private String fecha_cierre;
    private int cantidad_horas;
    private int id_categoria;
    
    
    public Capacitacion() {
    }

    
    public Capacitacion(String nombre, String fecha_inicio, String fecha_cierre, int cantidad_horas, int id_categoria) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cierre = fecha_cierre;
        this.cantidad_horas = cantidad_horas;
        this.id_categoria = id_categoria;
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
}
