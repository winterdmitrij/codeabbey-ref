package de.winter;

import de.winter.tasks.Problem014;

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
		String inputData = "3\n"
				+ "+ 40\n"
				+ "+ 600\n"
				+ "+ 74\n"
				+ "+ 9\n"
				+ "+ 834\n"
				+ "* 520\n"
				+ "* 58\n"
				+ "+ 9\n"
				+ "+ 10\n"
				+ "+ 23\n"
				+ "+ 1192\n"
				+ "+ 35\n"
				+ "* 26\n"
				+ "+ 82\n"
				+ "* 2\n"
				+ "* 9821\n"
				+ "* 124\n"
				+ "+ 1265\n"
				+ "* 7310\n"
				+ "* 9\n"
				+ "* 60\n"
				+ "+ 8\n"
				+ "+ 8\n"
				+ "+ 75\n"
				+ "* 8\n"
				+ "+ 9118\n"
				+ "+ 2734\n"
				+ "* 25\n"
				+ "+ 73\n"
				+ "* 48\n"
				+ "+ 9\n"
				+ "* 3710\n"
				+ "* 7821\n"
				+ "* 2\n"
				+ "+ 6\n"
				+ "+ 3650\n"
				+ "* 68\n"
				+ "* 2\n"
				+ "+ 8\n"
				+ "* 182\n"
				+ "* 840\n"
				+ "* 102\n"
				+ "+ 10\n"
				+ "+ 6332\n"
				+ "+ 456\n"
				+ "* 533\n"
				+ "+ 19\n"
				+ "+ 7852\n"
				+ "* 7\n"
				+ "% 3259";
		
		Problem014 x = new Problem014();
		
		x.input(inputData);
		x.process();
		x.output();
	}
	
}
