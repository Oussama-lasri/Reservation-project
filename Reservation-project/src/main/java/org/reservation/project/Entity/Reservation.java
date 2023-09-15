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

}
