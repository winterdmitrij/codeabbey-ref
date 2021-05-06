package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Parity Control
 * 
 * @author dmitrij
 *
 */
public class Problem033 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	String result = "";
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( String item : tmpArr )
			this.inputList.add( Integer.parseInt( item ) );
	}

	@Override
	public void process() {
		for ( int item : this.inputList ) {
			this.result += intToChar(item);
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		
		System.out.println(this.result);
	}

	public String intToChar(int number) {
		char c = 0;
		int numOfBits = 0;
		String bin = Integer.toBinaryString(number);
		
		for ( int i = 0; i < bin.length(); i++ ) {
			numOfBits += Integer.parseInt( String.valueOf( bin.charAt(i) ) );
		}
		
		if ( number > 128 && numOfBits % 2 == 0) {
			number -= 128;
			c = (char) number;
		} else if ( number < 128 && numOfBits % 2 == 0 ) {
			c = (char) number;
		} else
			return "";
		return String.valueOf(c);
	}
}
