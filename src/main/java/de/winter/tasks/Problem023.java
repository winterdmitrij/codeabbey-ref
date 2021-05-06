package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Bubble in Array and Checksum
 * 
 * @author dmitrij
 *
 */
public class Problem023 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	int swap = 0, pass = 0;
	long checksum = 0;
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( int i = 0; i < tmpArr.length - 1; i++ )
			this.inputList.add( Integer.parseInt( tmpArr[i] ) );
		
		System.out.println(this.inputList);
	}

	
	@Override
	public void process() {
		// Bubble Sort		
		boolean marke = true;
		int length = this.inputList.size() - 1;
		int tmpNumber;
		
		while ( marke ) {
			marke = false;
			this.pass++;
			for (int i = 0; i < length; i++) {
				if ( this.inputList.get(i) > this.inputList.get(i+1) ) {
					tmpNumber = this.inputList.get(i);
					this.inputList.set( i, this.inputList.get(i+1) );
					this.inputList.set( i+1, tmpNumber );
					
					marke = true;
					this.swap++;
				}
			}
			System.out.println( length + "; " + this.pass + ": " + this.inputList + " - " + this.swap);
			length--;
			
		}
		
		// Checksum
		final int SEED = 113;
		final int LIMIT = 10000007;
		
		for ( int i = 0; i < this.inputList.size(); i++ ) {
			this.checksum = ( this.checksum + this.inputList.get(i) ) * SEED;
			
			if ( this.checksum % LIMIT > 0 ) {
				this.checksum %= LIMIT;
			}
		}		
	}

	
	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		System.out.println( this.pass + " " + this.checksum );
	}
}
