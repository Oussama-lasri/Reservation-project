package org.reservation.project.Entity;

import java.util.List;

public class Chambre {
    private int num_chambre ;
    private String num_tel ;
    private List<Client> clientList ;
    private List<Categorie> categorieList ;

    public Chambre(int num_chambre, String num_tel, List<Client> clientList, List<Categorie> categorieList, List<Reservation> reservationList) {
        this.num_chambre = num_chambre;
        this.num_tel = num_tel;
        this.clientList = clientList;
        this.categorieList = categorieList;
        this.reservationList = reservationList;
    }

    public Chambre() {
    }

    private List<Reservation> reservationList ;

    public int getNum_chambre() {
        return num_chambre;
    }

    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Categorie> getCategorieList() {
        return categorieList;
    }

    public void setCategorieList(List<Categorie> categorieList) {
        this.categorieList = categorieList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
