package org.reservation.project.Entity;

public class ClientReservation {
    private Client client ;
    private Reservation reservation ;

    public ClientReservation(Client client, Reservation reservation) {
        this.client = client;
        this.reservation = reservation;
    }

    public ClientReservation() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
