package de.winter.tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/** Median of Three
 * 
 * @author dmitrij
 *
 */

public class Problem041 extends TaskSolution{
	List<Integer> inputListA = new ArrayList<Integer>();
	List<Integer> inputListB = new ArrayList<Integer>();
	List<Integer> inputListC = new ArrayList<Integer>();
	
	List<Integer> result = new ArrayList<Integer>();
	
	
	@Override
	public void input(String s) {
		StringTokenizer st = new StringTokenizer(s, " \n");
		List<Integer> tmpList = new ArrayList<Integer>();
		
		while ( st.hasMoreTokens() ) {
			tmpList.add( Integer.parseInt( st.nextToken() ) );
		}
		
		for ( int i = 0; i < tmpList.size(); i++ ) {
			if ( i % 3 == 0 )
				this.inputListA.add( tmpList.get(i) );
			else if ( i % 3 == 1 )
				this.inputListB.add( tmpList.get(i) );
			else
				this.inputListC.add( tmpList.get(i) );
		}
	}

	@Override
	public void process() {
		for ( int i = 0; i < this.inputListA.size(); i++ ) {
			this.result.add( median( this.inputListA.get(i), this.inputListB.get(i), this.inputListC.get(i) ) );
		}
		
		
		
	}

	@Override
	public void output() {
		for ( int item : this.result ) {
			System.out.print(item + " ");
		}
	}
	
	public int median(int a, int b, int c) {
		int[] tmpArr = new int[] { a, b, c };
		
		return sort(tmpArr)[1];
	}
	
	public int[] sort(int[] arr) {
		int tmpZahl;
		int comparMax = arr.length - 1;
		boolean marke = true;
		
		while ( marke ) {
			marke = false;
			for ( int i = 0; i < comparMax; i++ ) {
				if ( arr[i] > arr[i+1] ) {
					tmpZahl = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmpZahl;
					marke = true;
				}
			}
			comparMax--;
		}
		
		return arr;
	}
}
