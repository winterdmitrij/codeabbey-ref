package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/**
 * 
 * @author dmitrij
 *
 */
public class Problem003 extends TaskSolution{
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
		int summ;
		for (int item : listA) {
			summ = item + listB.get(listA.indexOf(item));
			this.result.add(summ);
		}
	}
	
	public void output() {
		for (int item : result)
			System.out.print(item + " ");
	}	
}