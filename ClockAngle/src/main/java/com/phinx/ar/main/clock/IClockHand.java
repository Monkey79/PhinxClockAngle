package com.phinx.ar.main.clock;

public interface IClockHand {
	public void calculateAngleFromOrigen();
	public IAngleFormat getAngleBetweenClockHand(IClockHand clockHand);
	
	public double getAngleFromOrigen();
	public double getMyMinutes();
	
	public void setMyMinutes(double myMinutes);
	public void setAngleFromOrigen(double angleFromOrigen);
}
