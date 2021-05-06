package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Array Counters
 * 
 * @author comline
 *
 */
public class Problem021 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	int[] result = new int[20];
	int maxIndex = 0;
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( String item : tmpArr )
			this.inputList.add( Integer.parseInt(item) );
	}

	
	@Override
	public void process() {
		for ( int item : this.inputList ) {
			if ( item > this.maxIndex )
				this.maxIndex = item;
			this.result[item - 1]++;
		}
	}

	
	@Override
	public void output() {
		System.out.println(this.inputList);
		
		for ( int i = 0; i < this.maxIndex; i++ )
			System.out.print( this.result[i] + " " );
	}
}