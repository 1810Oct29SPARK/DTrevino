package com.revature.beans;

import java.awt.image.BufferedImage;

public class Reimbursement {


	private int id; 
	private int manId; 
	private int reimbID; 
	private double amount; 
	private String status; 
	private BufferedImage image; 
	
	public Reimbursement(int id, int manId, int reimbID, double amount, String status, BufferedImage image) {
		super();
		this.id = id;
		this.manId = manId;
		this.reimbID = reimbID;
		this.amount = amount;
		this.status = status;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManId() {
		return manId;
	}

	public void setManId(int manId) {
		this.manId = manId;
	}

	public int getReimbID() {
		return reimbID;
	}

	public void setReimbID(int reimbID) {
		this.reimbID = reimbID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", manId=" + manId + ", reimbID=" + reimbID + ", amount=" + amount
				+ ", status=" + status + "]";
	}
	
	
}
