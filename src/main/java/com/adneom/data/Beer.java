package com.adneom.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Represents the concept of a beer inside the system
 * 
 * @author fakefla
 *
 */
@Entity
@Table(name = "beer")
//@formatter:off
@NamedQueries({
	@NamedQuery(name="Beer.findAll", query="SELECT b FROM Beer b")
})
//@formatter:on
public class Beer {

	@Id
	private Integer id;
	@Column
	private String name;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "brewery_id", nullable = false)
	private Brewery brewery;
	@Column
	private String type;
	@Column(name = "alcohol_content")
	private Double alcoholContent;

	public Beer() {
	}

	public Beer(String name, String brewery, String type) {
		super();
		this.name = name;
		// this.brewery = brewery;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brewery getBrewery() {
		return brewery;
	}

	public void setBrewery(Brewery brewery) {
		this.brewery = brewery;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
