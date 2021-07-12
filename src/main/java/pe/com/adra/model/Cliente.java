package pe.com.adra.model;

public class Cliente {
    private int id_persona;
    private int id_banco_comunal;
    private String fecha_ingreso;

    public Cliente() {
    }

    public Cliente(int id_banco_comunal, String fecha_ingreso) {
        this.id_banco_comunal = id_banco_comunal;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_banco_comunal() {
        return id_banco_comunal;
    }

    public void setId_banco_comunal(int id_banco_comunal) {
        this.id_banco_comunal = id_banco_comunal;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    
    
}
