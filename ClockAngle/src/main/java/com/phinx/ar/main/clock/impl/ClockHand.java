package com.phinx.ar.main.clock.impl;


import com.phinx.ar.main.clock.IAngleFormat;
import com.phinx.ar.main.clock.IClockHand;



public class ClockHand implements IClockHand {
	private HandType handType;
	
	private double angleFromOrigen;	
	private double myMinutes;

	public ClockHand(HandType handType) {
		this.handType = handType;
		this.angleFromOrigen = 0;
		this.myMinutes = 0;
	}
	
	public void calculateAngleFromOrigen() {
		angleFromOrigen = myMinutes * (double)this.handType.getDisplacementDegrees();
	}
	
	public IAngleFormat getAngleBetweenClockHand(IClockHand clockHand) {
		double resultAngle = (double)(angleFromOrigen - clockHand.getAngleFromOrigen());
		
		IAngleFormat angleFormat = new AngleFormat(resultAngle);
			
		return angleFormat;
	}
	
	/*==Setters & Getters===*/	
	public double getAngleFromOrigen() {
		return angleFromOrigen;
	}

	public double getMyMinutes() {
		return myMinutes;
	}

	public void setMyMinutes(double myMinutes) {
		this.myMinutes = myMinutes;
	}

	public void setAngleFromOrigen(double angleFromOrigen) {
		this.angleFromOrigen = angleFromOrigen;
	}
}
