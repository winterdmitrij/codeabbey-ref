package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

public class Problem015 extends TaskSolution{
	List<Integer> testData = new ArrayList<Integer>();
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	public void input(String s) {
		String[] str = s.split(" ");
		for (String item : str) {
			this.testData.add( Integer.parseInt(item) );
		}
	}
	
	public void process() {
		for (int item : testData) {
			if (item > max)
				this.max = item;
			if (item < min)
				this.min = item;
		}
	}
	
	public void output() {
		System.out.println(this.max + " " + this.min);
	}
}