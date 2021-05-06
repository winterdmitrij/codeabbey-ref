package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Neumann's Random Generator
 * 
 * @author dmitrij
 *
 */
public class Problem024 extends TaskSolution{
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
			this.result.add( numberOfIteration(item) );
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( int item : this.result )
			System.out.print( item + " " );
	}

	
	public int numberOfIteration(int number) {
		List<Integer> numbers = new ArrayList<Integer>();
		int iteration = 0;
		int tmpNumber = number;
		
		while ( !numbers.contains(tmpNumber) ) {
			numbers.add(tmpNumber);
			iteration++;
			tmpNumber *= tmpNumber;
			tmpNumber /= 100;
			tmpNumber %= 10000;
		}
		
		return iteration;
	}
}
