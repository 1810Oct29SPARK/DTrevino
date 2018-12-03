package com.revature.transport;

public class Boat extends Vehicle implements Steerable {
	
	public Boat() {
		super();
		System.out.println("boat noargs constructor completed");
	}

	public Boat(String color, double hullLengthInMeters) {
		super();
		this.color = color;
		this.hullLengthInMeters = hullLengthInMeters;
	}

	protected String color;
	protected double hullLengthInMeters;
	protected boolean hasHoleinHull; 
	
	@Override
	public void move() throws MaintenenceException {
		
		if (this.hasHoleinHull) {
			throw new MaintenenceException("unseaworthy");
		}
		System.out.println("boat is moving");

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHullLengthInMeters() {
		return hullLengthInMeters;
	}

	public void setHullLengthInMeters(double hullLengthInMeters) {
		this.hullLengthInMeters = hullLengthInMeters;
	}

	@Override
	public String toString() {
		return "Boat [color=" + color + ", hullLengthInMeters=" + hullLengthInMeters + "]";
	}

	@Override
	public void turnRight() {
		
		System.out.println("paddle right");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		
		System.out.println("paddle right");
		// TODO Auto-generated method stub
		
	}

	public boolean isHasHoleinHull() {
		return hasHoleinHull;
	}

	public void setHasHoleinHull(boolean hasHoleinHull) {
		this.hasHoleinHull = hasHoleinHull;
	}

}