package org.reservation.project.Entity;

import java.util.List;

public class Client {
    private int id_client ;
    private String nom_client ;
    private String prenom_client ;
    private List<Chambre> chambreList ;

    public Client(int id_client, String nom_client, String prenom_client, List<Chambre> chambreList) {
        this.id_client = id_client;
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.chambreList = chambreList;
    }

    public Client() {
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public List<Chambre> getChambreList() {
        return chambreList;
    }

    public void setChambreList(List<Chambre> chambreList) {
        this.chambreList = chambreList;
    }
}
