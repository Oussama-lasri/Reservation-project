package org.reservation.project.Entity;

public class TypeReservation {
    private int id_type ;
    private String pension ;
    private float tarif ;

    public TypeReservation(int id_type, String pension, float tarif) {
        this.id_type = id_type;
        this.pension = pension;
        this.tarif = tarif;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
