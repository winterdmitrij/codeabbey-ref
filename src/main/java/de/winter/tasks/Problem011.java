package de.winter.tasks;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

public class Problem011 extends TaskSolution{
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
		int tmpZahl;
		for ( int i = 0; i < this.inputListA.size(); i++ ) {
			tmpZahl = this.inputListA.get(i) * this.inputListB.get(i) + this.inputListC.get(i);
			this.result.add( summOfDigits(tmpZahl) );
		}
	}
		
	@Override
	public void output() {
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}
	
	public int summOfDigits(int zahl) {
		int summ = 0;
		int rest = zahl;
		
		while ( rest != 0 ) {
			summ += rest % 10;
			rest /= 10; 
		}
		
		return summ;
	}
}
