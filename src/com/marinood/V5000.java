package com.marinood;

public class V5000 extends SpaceCraft {

	private String color;
	private boolean autoPilot;
	private String projectManager;

	public V5000(String model, String fuelType, String lanchDate, String color, boolean autoPilot) {
		super(model, fuelType, lanchDate);
		this.color = color;
		this.autoPilot = autoPilot;
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

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

}
