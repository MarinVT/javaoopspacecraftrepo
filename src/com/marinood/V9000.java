package com.marinood;

public class V9000 extends SpaceCraft {

	private String color;
	private boolean autoPilot;

	public V9000(String model, String fuelType, String lanchDate, String color, boolean autoPilot) {
		super(model, fuelType, lanchDate);
		this.color = color;
		this.autoPilot = autoPilot;
	}

	@Override
	public void startEngine() {
		System.out.println("V9000 started in turbo mode");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAutoPilot() {
		return autoPilot;
	}

	public void setAutoPilot(boolean autoPilot) {
		this.autoPilot = autoPilot;
	}

}
