package org.reservation.project.Entity;

import java.util.List;

public class CategorieChambre {

    private Categorie categorie ;
    private Chambre chambre ;
    public CategorieChambre() {
    }

    public CategorieChambre(Categorie categorie, Chambre chambre) {
        this.categorie = categorie;
        this.chambre = chambre;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }


}
