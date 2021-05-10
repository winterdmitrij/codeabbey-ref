package de.winter;

import de.winter.tasks.Problem001;
import de.winter.tasks.Problem014;
import de.winter.tasks.Problem019;
import de.winter.tasks.Problem023;
import de.winter.tasks.Problem032;
import de.winter.tasks.Problem033;
import de.winter.tasks.Problem034;
import de.winter.tasks.Problem039;

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
		String inputData = "JOOG 99 99 99 99 99 99 99 101 101 101 101 101 101 101\n"
				+ "GOLD 95 105 95 105 95 105 95 105 95 105 95 105 95 105\n";
		
		Problem039 x = new Problem039();
		
		x.input(inputData);
		x.process();
		x.output();
	}
	
}
