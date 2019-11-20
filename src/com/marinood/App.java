package com.marinood;

public class App {

	public static void main(String[] args) {
		
		SpaceCraft vSpaceCraft = new V9000("V9000", "LXO", "4/16/2019", "Blue", true);

		SpaceCraft xSpaceCraft = new V5000("X5000", "LXO", "10/16/2019", "White", false);

		System.out.println("*** V9000 SpaceCraft ***");
		vSpaceCraft.startEngine();
		System.out.println(vSpaceCraft.getFuelType());
//		System.out.println(vSpaceCraft.getColor() + "\n");


		System.out.println("*** V5000 SpaceCraft ***");
		xSpaceCraft.startEngine();
//		xSpaceCraft.setProjectManager("Marin VT");
//		System.out.println(xSpaceCraft.getColor());
		System.out.println(xSpaceCraft.getLanchDate());
//		System.out.println(xSpaceCraft.getProjectManager());
	}
}
