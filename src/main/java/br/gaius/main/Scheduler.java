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
        //verifica se o local está ocupado no intervalo pretendido
        //verifica se o usuário já possui outras reservas para o intervalo pretendido
        
        return false;
    }
    
    public boolean removeReservation(Reservation reservation) {
        return false;
    }
    
    public List<Reservation> getReservationList(){
        return reservations;
    }
    
}
