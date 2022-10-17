package br.gaius.main;

import java.util.ArrayList;
import java.util.List;
import br.gaius.models.Reservation;
import br.gaius.models.User;
import br.gaius.models.Workstation;

public class Scheduler {

    List<User> users;
    List<Workstation> workstations;
    List<Reservation> reservations;
    
    public Scheduler() {
        users = new ArrayList<User>();
        workstations = new ArrayList<Workstation>();
        reservations = new ArrayList<Reservation>();
    }
}
