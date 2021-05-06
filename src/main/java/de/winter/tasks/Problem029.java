package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Sort with Indexes
 * 
 * @author dmitrij
 *
 */
public class Problem029 extends TaskSolution{
	List<Element> inputList = new ArrayList<Element>(); 
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( int i = 0; i < tmpArr.length; i++)
			this.inputList.add( new Element( i+1 , Integer.parseInt( tmpArr[i] ) ) );
	}
	

	@Override
	public void process() {
		boolean marke = true;
		int length = this.inputList.size() - 1;
		Element tmpElement;
		
		while ( marke ) {
			marke = false;
			for ( int i = 0; i < length; i++ ) {
				if ( this.inputList.get(i).getValue() > this.inputList.get(i+1).getValue() ) {
					tmpElement = this.inputList.get(i);
					this.inputList.set( i, this.inputList.get(i+1) );
					this.inputList.set( i+1, tmpElement );
					
					marke = true;
				}
			}
			length--;
		}
	}
	

	@Override
	public void output() {
		System.out.println( this.inputList );
		System.out.println();
		
		for ( Element item : this.inputList )
			System.out.print( item.getIndex() + " " );
	}
}


class Element{
	int index, value;

	public Element(int index, int value) {
		this.index = index;
		this.value = value;
	}

	
	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}


	@Override
	public String toString() {
		return "" + index + ": " + value + " ";
	}
}