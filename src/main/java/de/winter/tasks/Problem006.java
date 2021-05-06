package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

public class Problem006 extends TaskSolution{
	List<Integer> listA = new ArrayList<Integer>();
	List<Integer> listB = new ArrayList<Integer>();
	
	List<Integer> result = new ArrayList<Integer>();
	
	
	public void input(String s) {
		StringTokenizer st = new StringTokenizer(s, " \n");
		List<Integer> tempList = new ArrayList<Integer>();
		
		while (st.hasMoreTokens()) {
			tempList.add(Integer.parseInt(st.nextToken()));
		}

		for (int item : tempList) {
			if (tempList.indexOf(item) % 2 == 0)
				this.listA.add(item);
			else
				this.listB.add(item);
		}
	}
	
	
	public void process() {
		double ergebnis;
		for (int i = 0; i < this.listA.size(); i++) {
			ergebnis = (double) this.listA.get(i) / this.listB.get(i); 
			this.result.add( round(ergebnis) );
		}
	}
	
	
	public void output() {
		for (int item : result) {
			System.out.print(item + " ");
		}
	}
	
	
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




