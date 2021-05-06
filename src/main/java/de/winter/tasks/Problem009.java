package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/** Triangles
 * 
 * @author dmitrij
 *
 */
public class Problem009 extends TaskSolution{
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
			this.result.add( isTriangle( this.inputListA.get(i), this.inputListB.get(i), this.inputListC.get(i) ) );
		}
	}

	
	@Override
	public void output() {
		System.out.println(this.inputListA);
		System.out.println(this.inputListB);
		System.out.println(this.inputListC);
		for ( int item : this.result )
			System.out.print(item + " ");
	}
	
	// Methode, die überprüft, ob Dreieck existieren kann
	public int isTriangle(int a, int b, int c) {
		/*
		int zahl = 1;
		
		if ( (a + b < c) || (a + c < b) || (b + c < a) )
			zahl = 0;
		
		return zahl;
		*/
		
		// oder kürzer:
		return ( (a + b < c) || (a + c < b) || (b + c < a) ) ? 0 : 1;
	}
}
