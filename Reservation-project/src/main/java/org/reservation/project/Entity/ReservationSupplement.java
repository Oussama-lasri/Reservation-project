package org.reservation.project.Entity;

public class ReservationSupplement {
    private Reservation reservation ;
    private Supplement supplement ;

    public ReservationSupplement(Reservation reservation, Supplement supplement) {
        this.reservation = reservation;
        this.supplement = supplement;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Supplement getSupplement() {
        return supplement;
    }

    public void setSupplement(Supplement supplement) {
        this.supplement = supplement;
    }
}
