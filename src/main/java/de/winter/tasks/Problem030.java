package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Reverse String
 * 
 * @author comline
 *
 */
public class Problem030 extends TaskSolution{
	String inputString = "";
	String result = "";
	
	
	@Override
	public void input(String str) {
		this.inputString = str;
	}

	@Override
	public void process() {
		int length = this.inputString.length();
		for ( int i = 0; i < length; i++ ) {
			this.result  += this.inputString.charAt(length - i - 1);
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputString);
		
		System.out.println(this.result);
	}
}