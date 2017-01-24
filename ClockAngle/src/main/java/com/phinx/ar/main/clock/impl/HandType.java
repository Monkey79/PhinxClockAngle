package com.phinx.ar.main.clock.impl;


public enum HandType {
	HOUR(0.5), MINUTES(6), SECONDS(360);
	
	private double displacementDegrees;
	
	private HandType(double displacementDegrees){
		this.displacementDegrees = displacementDegrees;
	}

	public double getDisplacementDegrees() {
		return displacementDegrees;
	}	

}
