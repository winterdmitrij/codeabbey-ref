package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

public class Problem005 extends TaskSolution{
	List<Integer> listA = new ArrayList<Integer>(); // TODO: listA -> inputListA
	List<Integer> listB = new ArrayList<Integer>();
	List<Integer> listC = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	
	
	public void input(String s) {
		StringTokenizer st = new StringTokenizer(s, " \n");
		List<Integer> tempList = new ArrayList<Integer>();
		
		while (st.hasMoreTokens()) {
			tempList.add(Integer.parseInt(st.nextToken()));
		}

		for (int item : tempList) {
			if (tempList.indexOf(item) % 3 == 0)
				this.listA.add(item);
			else if (tempList.indexOf(item) % 3 == 1)
				this.listB.add(item);
			else
				this.listC.add(item);
		}
	}
	
	public void process() {
		for (int i = 0; i < this.listA.size(); i++) {
			this.result.add( minimum( this.listA.get(i), minimum( this.listB.get(i), this.listC.get(i) ) ) );
		}
	}
	
	public void output() {
		for (int item : result)
			System.out.print(item + " ");
	}
	
	public int minimum(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
}