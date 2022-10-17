package br.gaius.main;

import java.util.ArrayList;
import java.util.List;
import br.gaius.models.Reservation;

public class Scheduler {

    List<Reservation> reservations;
    
    public Scheduler() {
        reservations = new ArrayList<Reservation>();
    }
    
    public boolean  makeReservation(Reservation reservation) {
        return false;
    }
    
    public boolean removeReservation(Reservation reservation) {
        return false;
    }
    
    public List<Reservation> getReservationList(){
        return reservations;
    }
}
