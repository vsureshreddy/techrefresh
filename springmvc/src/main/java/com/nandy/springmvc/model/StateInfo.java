package com.nandy.springmvc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StateInfo {
	
	private int id;
	private String country;
	private String stateAbbr;
	private String stateDesc;
	private String stateCapital;
	private String largestCity;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStateAbbr() {
		return stateAbbr;
	}
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}
	public String getLargestCity() {
		return largestCity;
	}
	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

}
