package pe.com.adra.model;

public class Profesor {
    private int id_profesor;
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    

}
