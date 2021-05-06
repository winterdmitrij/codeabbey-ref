package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/** Arithmetic Progression
 * 
 * @author dmitrij
 *
 */

public class Problem008 extends TaskSolution{
	List<Progression> progressions = new ArrayList<Progression>();
	List<Integer> result = new ArrayList<Integer>();
	
	@Override
	public void input(String s) {
		StringTokenizer st = new StringTokenizer(s, " \n");
		List<Integer> tmpList = new ArrayList<Integer>();
		
		while ( st.hasMoreTokens() ) {
			tmpList.add( Integer.parseInt( st.nextToken() ) );
		}
		
		for ( int i = 0; i < tmpList.size(); i += 3 ) {
			this.progressions.add( new Progression( tmpList.get(i), tmpList.get(i + 1), tmpList.get(i + 2) ) );
		}
	}
	
	@Override
	public void process() {
		for ( Progression p : this.progressions ) {
			this.result.add( summOfProgression(p) );
		}
	}
	
	@Override
	public void output() {
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}
	
	// Methode, die Summe aller Elementen der Progression berechnet.
	public int summOfProgression(Progression p) {
		int summ = 0;
		
		for ( int i = 0; i < p.getCount(); i++ ) {
			summ += ( p.getFirstValue() + p.getStep() * i );
		}
		
		return summ;
	}
}

class Progression {
	private int firstValue;
	private int step;
	private int count;
		
	public Progression(int firstValue, int step, int count) {
		this.firstValue = firstValue;
		this.step = step;
		this.count = count;
	}
	
	public int getFirstValue() {
		return firstValue;
	}
	public int getStep() {
		return step;
	}
	public int getCount() {
		return count;
	}
		
	public String toString() {
		String s = "";
		
		for ( int i = 0; i < this.count; i++ ) {
			s += ( this.firstValue + this.step * i ) + ", ";
		}
		
		return s;
	}
}
