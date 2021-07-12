package pe.com.adra.model;

public class Cuenta_Rol {
    private int id_cuenta_rol;
    private int id_rol;
    private int id_persona;

    public Cuenta_Rol() {
    }

    public Cuenta_Rol(int id_rol, int id_persona) {
        this.id_rol = id_rol;
        this.id_persona = id_persona;
    }

    public int getId_cuenta_rol() {
        return id_cuenta_rol;
    }

    public void setId_cuenta_rol(int id_cuenta_rol) {
        this.id_cuenta_rol = id_cuenta_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
