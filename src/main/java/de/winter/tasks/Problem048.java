package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Collatz Sequence
 * 
 * @author comline
 *
 */
public class Problem048 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( String item : tmpArr )
			this.inputList.add( Integer.parseInt(item) );
	}

	
	@Override
	public void process() {
		for ( int item : this.inputList )
			this.result.add( collatzSequence(item) );
	}

	
	@Override
	public void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result )
			System.out.print( item + " " );
		
	}
	
	
	public int collatzSequence(int number) {
		int countOfSteps = 0;
		
		while ( number != 1 ) {
			if ( number % 2 == 0 )
				number /= 2;
			else
				number = 3 * number + 1;
			countOfSteps++;
		}
		
		return countOfSteps;
	}
}