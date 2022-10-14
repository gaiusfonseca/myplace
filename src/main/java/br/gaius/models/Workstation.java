package br.gaius.models;

import br.gaius.address.Address;

public class Workstation {

	private String id;
	private Address address;

	public Workstation() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
