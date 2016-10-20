package com.adneom.data;

/**
 * Represents the concept of a beer inside the system
 * 
 * @author fakefla
 *
 */
public class Beer {

	private String name;
	private String brewery;
	private String type;

	public Beer() {
	}

	public Beer(String name, String brewery, String type) {
		super();
		this.name = name;
		this.brewery = brewery;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrewery() {
		return brewery;
	}

	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
