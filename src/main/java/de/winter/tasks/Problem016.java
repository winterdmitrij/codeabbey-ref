package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Average of an array
 * 
 * @author comline
 *
 */
public class Problem016 extends TaskSolution{
	List<String> inputList = new ArrayList<String>();
	List<Integer> result = new ArrayList<Integer>();
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			this.inputList.add(item);
		}
	}

	@Override
	public void process() {
		for ( String item : this.inputList ) {
			String[] strArr = item.split(" ");
			int arrLength = strArr.length - 1;
			int[] intArr = new int[arrLength];
			
			for ( int i = 0; i < arrLength; i++ ) {
				intArr[i] = Integer.parseInt( strArr[i] );
			}
			
			this.result.add( averageOfAnArray( intArr ) );
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}
	
	
	public int averageOfAnArray(int[] arr) {
		int summ = 0;
		
		for ( int item : arr ) {
			summ += item;
		}

		return round( (double) summ / arr.length );
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