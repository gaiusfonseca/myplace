package br.gaius.models;

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
            throw new IllegalArgumentException("O id informado nãos egue o padrão de id para Workstaiton.");            
        }
        
        this.id = id;
    }
    
    private static boolean idIsValid(String id) {
      //verifica se o id possui 4 caarcteres
        if(id.length() != 4) {
            return false;
        }
        
        //verifica se o primeiro é letra
        for(int i = 0; i <= 3; i++) {
            if( i == 0 && !Character.isLetter(id.charAt(i))) {
                return false;
            }
            
            if(i != 0 && !Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}
