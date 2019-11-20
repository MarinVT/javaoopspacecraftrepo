package com.marinood;

public class SpaceCraft {

	private String model;
	private String fuelType;
	private String lanchDate;

	public SpaceCraft(String model, String fuelType, String lanchDate) {
		this.model = model;
		this.fuelType = fuelType;
		this.lanchDate = lanchDate;
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getLanchDate() {
		return lanchDate;
	}

	public void setLanchDate(String lanchDate) {
		this.lanchDate = lanchDate;
	}

}
