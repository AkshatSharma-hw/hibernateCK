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
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	private String language;
	private long population;
	private String name;
	
	
	@OneToOne(mappedBy = "country")
	@JoinColumn(name = "flagId")
	private Flag flag;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}
	
	
	
	
}
