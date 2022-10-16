package br.gaius.models;

public class Workstation {

	private String id;

	public Workstation(String id) {
		this.id = id;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //verifica se o id possui 4 caarcteres
        if(id.length() != 4) {
            throw new IllegalArgumentException("O id deve conter 4 caracteres.");
        }
        
        //verifica se o primeiro é letra
        for(int i = 0; i <= 3; i++) {
            if( i == 0 && !Character.isLetter(id.charAt(i))) {
                throw new IllegalArgumentException("o primeiro dígito deve ser uma letra.");
            }
            
            if(i != 0 && !Character.isDigit(id.charAt(i))) {
                throw new IllegalArgumentException(String.format("O caractere na posição %d deveria ser um dígito", i));
            }
        }
        
        this.id = id;
    }
}
