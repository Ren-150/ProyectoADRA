package pe.com.adra.model;

public class Enc_preg {
    private int id_enc_preg;
    private int id_enc_sat;
    private int id_pregunta;

    public Enc_preg() {
    }

    public Enc_preg(int id_enc_preg, int id_enc_sat, int id_pregunta) {
        this.id_enc_preg = id_enc_preg;
        this.id_enc_sat = id_enc_sat;
        this.id_pregunta = id_pregunta;
    }

    public int getId_enc_preg() {
        return id_enc_preg;
    }

    public void setId_enc_preg(int id_enc_preg) {
        this.id_enc_preg = id_enc_preg;
    }

    public int getId_enc_sat() {
        return id_enc_sat;
    }

    public void setId_enc_sat(int id_enc_sat) {
        this.id_enc_sat = id_enc_sat;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }
    
    
    
}
