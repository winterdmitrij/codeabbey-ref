package de.winter;

import de.winter.tasks.Problem001;
import de.winter.tasks.Problem014;
import de.winter.tasks.Problem023;
import de.winter.tasks.Problem032;
import de.winter.tasks.Problem033;
import de.winter.tasks.Problem034;

public class Application {

	public static void main(String[] args) {
		System.out.println("Programm startet");
		try {
			Application app = new Application();
			app.run();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nProgramm beendet");
		}
	}
	
	public void run() {
		String inputData = "8.19214032 0.70252389 415.37904014 1325.91693945\n"
				+ "12.05976917 0.05869150 498.62705381 522.09030810\n"
				+ "6.81849540 0.29683386 1623.23261314 -19.64927069\n"
				+ "10.95987745 0.30880503 1409.74102887 282.08289507\n"
				+ "7.51131222 0.03713050 1985.66725011 432.81574782\n"
				+ "2.82237324 0.32981366 1094.27920687 265.23101761\n"
				+ "13.82265695 0.38626877 317.98976488 35.15529995";
		
		Problem034 x = new Problem034();
		
		x.input(inputData);
		x.process();
		x.output();
	}
	
}
