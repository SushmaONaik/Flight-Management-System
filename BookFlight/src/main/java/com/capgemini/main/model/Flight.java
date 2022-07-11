package com.capgemini.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Flight {
	
	@Id
	private int flightId;
	private String flightName;
	private String flightFrom;
	private String flightTo;
	private String arrivesAtTime;
	private String reachesAtTime;
	public Flight() {
		super();
	}
	public Flight(int flightId, String flightName, String flightFrom, String flightTo, String arrivesAtTime,
			String reachesAtTime) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.arrivesAtTime = arrivesAtTime;
		this.reachesAtTime = reachesAtTime;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public String getArrivesAtTime() {
		return arrivesAtTime;
	}
	public void setArrivesAtTime(String arrivesAtTime) {
		this.arrivesAtTime = arrivesAtTime;
	}
	public String getReachesAtTime() {
		return reachesAtTime;
	}
	public void setReachesAtTime(String reachesAtTime) {
		this.reachesAtTime = reachesAtTime;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", flightFrom=" + flightFrom
				+ ", flightTo=" + flightTo + ", arrivesAtTime=" + arrivesAtTime + ", reachesAtTime=" + reachesAtTime
				+ "]";
	}
	
	

}
