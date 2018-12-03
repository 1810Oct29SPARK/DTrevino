package com.revature.transport;

import com.revature.transport.Vehicle;

public class Tornado extends Vehicle {

	public Tornado(double maxWindSpeed) {
		super();
		this.maxWindSpeed = maxWindSpeed;
	}

	public Tornado() {
		// TODO Auto-generated constructor stub
	}
	
	private double maxWindSpeed;
	private boolean isInSupercell; 
	
	@Override
	public void move() throws MaintenenceException {
		
		if (!this.isInSupercell) {
			throw new MaintenenceException("weather machine incorrectly config");
		}
		System.out.println("DESTROYING THE CITY");
		// TODO Auto-generated method stub

	}

	public double getMaxWindSpeed() {
		return maxWindSpeed;
	}

	public void setMaxWindSpeed(double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}

	@Override
	public String toString() {
		return "Tornado [maxWindSpeed=" + maxWindSpeed + "]";
	}

}
