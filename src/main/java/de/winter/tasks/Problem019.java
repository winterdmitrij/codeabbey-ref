package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Matching Brackets
 * 
 * @author comline
 *
 */
public class Problem019 extends TaskSolution{
	List<String> inputList = new ArrayList<String>();
	List<Boolean> result = new ArrayList<Boolean>();
	List<Character> openedBrackets = new ArrayList<Character>();
	List<Character> closedBrackets = new ArrayList<Character>();
	String brackets = "()[]{}<>";
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr )
			this.inputList.add(item);
		
		for ( int i = 0; i < brackets.length(); i++ ) {
			if ( i % 2 == 0 )
				this.openedBrackets.add( brackets.charAt(i) );
			else
				this.closedBrackets.add( brackets.charAt(i) );
		}
	}
	
	
	@Override
	public void process() {
		for ( String item : this.inputList ) {
			this.result.add( isMatchingBrackets(item) );
		}
	}

	
	@Override
	public void output() {
//		System.out.println(this.inputList);
		
		for ( boolean item : this.result )
			System.out.print( ( item ? 1 : 0 ) + " ");
	}

	
	public boolean isMatchingBrackets(String string) {
		List<Character> tmpList = new ArrayList<Character>();
		int index;
		char searchedChar = '0', curChar;
//		System.out.println(string.length());
		
		for ( int i = 0; i < string.length(); i++ ) {
			curChar = string.charAt(i);
			if ( this.openedBrackets.contains(curChar) ) {
				tmpList.add( curChar );
				index = this.openedBrackets.indexOf(curChar);
				searchedChar = this.closedBrackets.get(index);
//				System.out.println(i + ". aktBS: " + curChar + ",\t-> Array: " + tmpList + ".\tGesucht: " + searchedChar);
			}
			else if ( this.closedBrackets.contains(curChar) && curChar == searchedChar ) {
				
				tmpList.remove( tmpList.size() - 1 );
				
				if ( !tmpList.isEmpty() ) {
					index = this.openedBrackets.indexOf( tmpList.get( tmpList.size() - 1 ) );
					searchedChar = this.closedBrackets.get(index);
				}
				else
					searchedChar = '0';
//				System.out.println(i + ". aktBS: " + curChar + ",\t<- Array: " + tmpList+ ".\tGesucht: " + searchedChar);
			}
			else if ( this.closedBrackets.contains(curChar) && curChar != searchedChar ){
				return false;
			}
		}
//		System.out.println(tmpList.size());
		return tmpList.isEmpty() ? true : false;
	}
}