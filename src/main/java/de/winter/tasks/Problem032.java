package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Josephus Problem
 * 
 * @author dmitrij
 *
 */
public class Problem032 extends TaskSolution{
	List<Integer> peoples = new ArrayList<Integer>();
	int step, number, winner;
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		this.number = Integer.parseInt( tmpArr[0] );
		this.step = Integer.parseInt( tmpArr[1] );
	}

	@Override
	public void process() {
		for ( int i = 0; i < this.number; i++ )
			this.peoples.add(i+1);
		
		int index = 0;
		
		System.out.println(peoples);
		while ( this.peoples.size() > 1 ) {
			for ( int j = 0; j < this.peoples.size(); j++) {
				index++;
				if ( index % this.step == 0 ) {
					this.peoples.remove(j);
					j--;
					System.out.println(index + ": "+ j +": " + this.peoples);
				}
			}
		}
	}

	@Override
	public void output() {
		System.out.println("\n" + this.peoples.get(0));
	}
}
