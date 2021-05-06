package de.winter.tasks;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Rotate String
 * 
 * @author dmitrij
 *
 */
public class Problem031 extends TaskSolution{
	List<Integer> inputNumberList = new ArrayList<Integer>();
	List<String> inputStringList = new ArrayList<String>();
	List<String> result = new ArrayList<String>();
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			String[] tmpStr = item.split(" ");
			
			this.inputNumberList.add( Integer.parseInt( tmpStr[0] ) );
			this.inputStringList.add( tmpStr[1] );
		}
		
	}

	@Override
	public void process() {
		for ( int i = 0; i < this.inputStringList.size(); i++ )
			this.result.add( rotateString( this.inputNumberList.get(i), this.inputStringList.get(i) ) );
	}

	@Override
	public void output() {
		System.out.println(this.inputNumberList);
		System.out.println(this.inputStringList);
		
		for ( String item : this.result )
			System.out.print( item + " " );
	}

	
	public String rotateString(int number, String str) {
		char help;
		char[] charArr = str.toCharArray();
		String tmpStr = "";
				
		if ( number > 0 ) {
			while ( number != 0 ) {
				help = charArr[0];
				for ( int i = 0; i < str.length() - 1; i++) {
					charArr[i] = charArr[i+1];
				}
				charArr[str.length() - 1] = help;
				number--;
			}
		}
		else {
			while ( number != 0 ) {
				help = charArr[str.length() - 1];
				for ( int i = str.length() - 1; i > 0 ; i--) {
					charArr[i] = charArr[i-1];
				}
				charArr[0] = help;
				number++;
			}
		}
		
		for ( char item : charArr )
			 tmpStr += item;
		
		return tmpStr;
	}
}
