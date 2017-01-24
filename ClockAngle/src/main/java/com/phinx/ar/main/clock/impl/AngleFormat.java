package com.phinx.ar.main.clock.impl;

import com.phinx.ar.main.clock.IAngleFormat;

public class AngleFormat implements IAngleFormat {
	private double angle;
	
	private int degree;
	private int minutes;
	private int seconds;	
	
	
	public AngleFormat(double angle) {
		if(angle < 0)	angle*=-1;
		this.angle = angle;
		
		startFormat();
	}
	
	public void startFormat(){
		degree = (int)angle;
		minutes = (int)((angle - degree) * 60);
		seconds = (int)(angle - degree - (minutes/60))*3600;
	}	
	
	@Override
	public String toString() {
		return "AngleFormat ["+degree +"°"+ + minutes
				+ "'" + seconds +"''"+ "]";
	}	
}
