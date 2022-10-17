package br.gaius.models;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Workstation {

	private String id;

	public Workstation(String id) {
	    if(!idIsValid(id)) {
            throw new IllegalArgumentException("O id informado nãos egue o padrão de id para Workstaiton.");            
        }
        
        this.id = id;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!idIsValid(id)) {
            throw new IllegalArgumentException("O id informado não segue o padrão de id para Workstaiton.");            
        }
        
        this.id = id;
    }
    
    private static boolean idIsValid(String id) {
        Pattern idPattern = Pattern.compile("^[A-Z]\\d{3}$");
        Matcher idMatcher = idPattern.matcher(id);
        
        if(idMatcher.matches()) {
            return true;
        }else {
            return false;
        }
    }
}
