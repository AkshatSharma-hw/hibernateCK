package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Chetna Khapre
 * @version 1.0
 * @creation date 27/09/2019 11:22am
 *@modification time 27/09/2019 02:56pm
 */

@Entity
public class Flag {
	
	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	
	private int flagId;
	private String description;
	
	private String flagName;
	
	@OneToOne
	@JoinColumn(name = "countryId")
	private Country country;

	public int getFlagId() {
		return flagId;
	}

	public void setFlagId(int flagId) {
		this.flagId = flagId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFlagName() {
		return flagName;
	}

	public void setFlagName(String flagName) {
		this.flagName = flagName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
	
	
	
}
