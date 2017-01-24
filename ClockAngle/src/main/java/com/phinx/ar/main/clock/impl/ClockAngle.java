package com.phinx.ar.main.clock.impl;

import java.util.Calendar;
import java.util.Date;

import com.phinx.ar.main.clock.IClockAngle;
import com.phinx.ar.main.clock.IClockHand;

public class ClockAngle implements IClockAngle {
	private IClockHand hourCHnd;
	private IClockHand minCHnd;
	private IClockHand secCHnd;
	
	private Calendar calendar;

	public void start(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		setHours();
		setMinutes();
		setSeconds();
	}
	
	private void setHours(){
		hourCHnd = new ClockHand(HandType.HOUR);
		double minutes = (double)(calendar.get(Calendar.HOUR)*60) + calendar.get(Calendar.MINUTE) + (calendar.get(Calendar.SECOND)/60);
		hourCHnd.setMyMinutes(minutes);
		hourCHnd.calculateAngleFromOrigen();
	}
	
	private void setMinutes(){
		minCHnd = new ClockHand(HandType.MINUTES);
		double minutes = (double) calendar.get(Calendar.MINUTE) + (calendar.get(Calendar.SECOND)/60);
		minCHnd.setMyMinutes(minutes);
		minCHnd.calculateAngleFromOrigen();
	}
	
	private void setSeconds(){
		secCHnd = new ClockHand(HandType.SECONDS);
		double minutes = (double)(calendar.get(Calendar.SECOND)/ ((double)60));
		secCHnd.setMyMinutes(minutes);		
		secCHnd.calculateAngleFromOrigen();
	}

	public void showAngles() {
		System.out.println("HOUR AND MINUTES: "+hourCHnd.getAngleBetweenClockHand(minCHnd));
		System.out.println("HOUR AND SECONDS: "+hourCHnd.getAngleBetweenClockHand(secCHnd));
		System.out.println("MINUTES AND SECONDS: "+ minCHnd.getAngleBetweenClockHand(secCHnd));
	}
}
