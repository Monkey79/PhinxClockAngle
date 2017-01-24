package com.phinx.ar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.phinx.ar.main.clock.IClockAngle;
import com.phinx.ar.main.clock.impl.ClockAngle;
import com.phinx.ar.main.clock.impl.ClockHand;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		DateFormat formatter = new SimpleDateFormat("HH:mm:ss");

		try {
			Date date = formatter.parse("02:47:50");

			IClockAngle clockAngle = new ClockAngle();
			clockAngle.start(date);
			clockAngle.showAngles();

			Date date2 = formatter.parse("03:00:00");

			IClockAngle clockAngle2 = new ClockAngle();
			clockAngle2.start(date2);
			clockAngle2.showAngles();

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
