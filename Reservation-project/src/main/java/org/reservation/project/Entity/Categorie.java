package org.reservation.project.Entity;

import java.util.List;

public class Categorie {
    private int num_cat ;
    private int nbre_lit ;
    private float tarif ;
    private List<Chambre> chambreList ;

    public Categorie() {
    }

    public Categorie(int num_cat, int nbre_lit, float tarif, List<Chambre> chambreList) {
        this.num_cat = num_cat;
        this.nbre_lit = nbre_lit;
        this.tarif = tarif;
        this.chambreList = chambreList;
    }

    public int getNum_cat() {
        return num_cat;
    }

    public void setNum_cat(int num_cat) {
        this.num_cat = num_cat;
    }

    public int getNbre_lit() {
        return nbre_lit;
    }

    public void setNbre_lit(int nbre_lit) {
        this.nbre_lit = nbre_lit;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Chambre> getChambreList() {
        return chambreList;
    }

    public void setChambreList(List<Chambre> chambreList) {
        this.chambreList = chambreList;
    }
}
