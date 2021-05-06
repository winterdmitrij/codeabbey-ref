package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

public class Problem007 extends TaskSolution {
	List<Integer> listF = new ArrayList<Integer>();
	List<Integer> listC = new ArrayList<Integer>();
	
	
	public void input(String s) {
		String[] str = s.split(" ");
		
		for (String item : str) {
			this.listF.add( Integer.parseInt(item) );
		}	
	}
	
	
	public void process() {
		for ( int item : this.listF ) {
			this.listC.add( fahrenheitToCelsius(item) );
		}
	}
	
	
	public void output() {
		for (int item : listC) {
			System.out.print(item + " ");
		}
	}
	
	
	public int fahrenheitToCelsius(int tempF) {
		double tempC = (tempF - 32) * 5.0 / 9.0;
		return round( tempC );
	}
	
	// TODO; Math.round()
	public int round(double zahl) {
		int tmpZahl = (int) (zahl * 10);
		if (zahl > 0) {
			if ( tmpZahl % 10 < 5 )
				return tmpZahl / 10;
			else
				return tmpZahl / 10 + 1;
		}
		else {
			if ( Math.abs(tmpZahl) % 10 < 5 )
				return tmpZahl / 10;
			else
				return tmpZahl / 10 - 1;
		}
	}
}
