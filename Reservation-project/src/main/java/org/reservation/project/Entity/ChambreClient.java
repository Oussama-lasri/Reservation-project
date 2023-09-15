package org.reservation.project.Entity;

import java.util.List;

public class ChambreClient {
    private Chambre chambre ;
    private Client client ;

    public ChambreClient(Chambre chambre, Client client) {
        this.chambre = chambre;
        this.client = client;
    }

    public ChambreClient() {
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
