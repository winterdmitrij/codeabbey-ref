package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Linear Congruential Generator
 * 
 * @author dmitrij
 *
 */
public class Problem025 extends TaskSolution{
	List<TestCase> inputList = new ArrayList<TestCase>();
	List<Integer> result = new ArrayList<Integer>();
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			String[] tmpStr = item.split(" ");
			
			this.inputList.add( new TestCase( Integer.parseInt( tmpStr[0] ), Integer.parseInt( tmpStr[1] ), Integer.parseInt( tmpStr[2] ), Integer.parseInt( tmpStr[3] ), Integer.parseInt( tmpStr[4] ) ) );
		}
	}

	@Override
	public void process() {
		for ( TestCase testCase : this.inputList )
			this.result.add( testCase.getNMember() );
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result )
			System.out.print( item + " " );
	}

}

class TestCase {
	int A, C, M, X0, N;

	public TestCase(int a, int c, int m, int x0, int n) {
		A = a;
		C = c;
		M = m;
		X0 = x0;
		N = n;
	}
	
	public int getNMember() {
		int mem = this.X0;
		
		for ( int i = 0; i < this.N; i++ ) {
			mem = ( this.A * mem + this.C ) % this.M;
		}
		
		return mem;
	}

	@Override
	public String toString() {
		return "( A= " + A + ", C= " + C + ", M= " + M + ", X0= " + X0 + ", N= " + N + " )";
	}
}