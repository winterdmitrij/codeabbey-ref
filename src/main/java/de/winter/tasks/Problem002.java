package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/**
 * 
 * @author dmitrij
 * 
 */
public class Problem002 extends TaskSolution{
	List<Integer> testData = new ArrayList<Integer>();
	int result = 0;
	
	public void input(String s) {
		String[] str = s.split(" ");
		for (String item : str) {
			this.testData.add(Integer.parseInt(item));
		}
	}
	
	public void process() {
		for (int item : testData) {
			this.result += item;
		}
	}
	
	public void output() {
		System.out.println(this.result);
	}
}
