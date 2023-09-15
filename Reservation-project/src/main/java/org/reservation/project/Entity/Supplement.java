package org.reservation.project.Entity;

import java.util.List;

public class Supplement {
    private int id ;
    private String type ;
    private float tarif ;
    private List<Reservation> reservationList ;

    public Supplement(int id, String type, float tarif, List<Reservation> reservationList) {
        this.id = id;
        this.type = type;
        this.tarif = tarif;
        this.reservationList = reservationList;
    }

    public Supplement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
