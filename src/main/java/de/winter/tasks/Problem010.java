package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/** Linear Function
 * 
 * @author comline
 *
 */
public class Problem010 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	final int MIN = -10, MAX = 10;
	
	@Override
	public void input(String str) {
		StringTokenizer st = new StringTokenizer(str, " \n");
		
		while ( st.hasMoreTokens() )
			this.inputList.add( Integer.parseInt( st.nextToken() ) );
	}

	@Override
	public void process() {
		int x1, y1, x2, y2, a, b;
		
		for ( int i = 0; i < this.inputList.size(); i += 4 ) {
			x1 = this.inputList.get(i);
			y1 = this.inputList.get(i+1);
			x2 = this.inputList.get(i+2);
			y2 = this.inputList.get(i+3);
			
			a = ( y2 - y1 ) / ( x2 - x1 );
			b = y1 - a * x1;
			this.result.add( a );
			this.result.add( b );
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println(this.result);
		
		for ( int i = 0; i < this.result.size(); i += 2 )
			System.out.print( "(" + this.result.get(i) + " " + this.result.get(i+1) + ") " );
	}
}