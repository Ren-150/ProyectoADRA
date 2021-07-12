package pe.com.adra.model;

public class Encuesta_Satisfac {
    private int id_enc_sat;
    private String titulo;

    public Encuesta_Satisfac() {
    }

    public Encuesta_Satisfac(int id_enc_sat, String titulo) {
        this.id_enc_sat = id_enc_sat;
        this.titulo = titulo;
    }

    public int getId_enc_sat() {
        return id_enc_sat;
    }

    public void setId_enc_sat(int id_enc_sat) {
        this.id_enc_sat = id_enc_sat;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    

}
