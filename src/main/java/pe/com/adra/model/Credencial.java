package pe.com.adra.model;

public class Credencial {
    private int id_persona;
    private String nombre_usuario;
    private String contrasenia;
    private char estado;

    public Credencial() {
    }

    public Credencial(String nombre_usuario, String contrasenia, char estado) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
    
}
