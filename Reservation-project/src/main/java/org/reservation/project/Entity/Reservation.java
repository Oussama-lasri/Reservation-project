package org.reservation.project.Entity;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int num_reservation ;
    private Date date_reservation ;
    private Date date_arrivee ;
    private Date date_depart ;
    private int nbre_nuit ;
    private int nbre_chambre ;
    private List<Chambre> chambreList ;
    private TypeReservation typeReservation ;
    private List<Client> clientList ;
    private List<Supplement> supplementList ;

    public Reservation() {
    }

    public Reservation(int num_reservation, Date date_reservation, Date date_arrivee, Date date_depart, int nbre_nuit, int nbre_chambre, List<Chambre> chambreList, TypeReservation typeReservation, List<Client> clientList, List<Supplement> supplementList) {
        this.num_reservation = num_reservation;
        this.date_reservation = date_reservation;
        this.date_arrivee = date_arrivee;
        this.date_depart = date_depart;
        this.nbre_nuit = nbre_nuit;
        this.nbre_chambre = nbre_chambre;
        this.chambreList = chambreList;
        this.typeReservation = typeReservation;
        this.clientList = clientList;
        this.supplementList = supplementList;
    }

    public int getNum_reservation() {
        return num_reservation;
    }

    public void setNum_reservation(int num_reservation) {
        this.num_reservation = num_reservation;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public int getNbre_nuit() {
        return nbre_nuit;
    }

    public void setNbre_nuit(int nbre_nuit) {
        this.nbre_nuit = nbre_nuit;
    }

    public int getNbre_chambre() {
        return nbre_chambre;
    }

    public void setNbre_chambre(int nbre_chambre) {
        this.nbre_chambre = nbre_chambre;
    }

    public List<Chambre> getChambreList() {
        return chambreList;
    }

    public void setChambreList(List<Chambre> chambreList) {
        this.chambreList = chambreList;
    }

    public TypeReservation getTypeReservation() {
        return typeReservation;
    }

    public void setTypeReservation(TypeReservation typeReservation) {
        this.typeReservation = typeReservation;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Supplement> getSupplementList() {
        return supplementList;
    }

    public void setSupplementList(List<Supplement> supplementList) {
        this.supplementList = supplementList;
    }
}
