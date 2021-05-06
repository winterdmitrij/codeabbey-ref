package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

public class Problem020 extends TaskSolution{
	List<String> inputStrings = new ArrayList<String>();	
	List<Integer> vowelCounts = new ArrayList<Integer>();
	
	char[] vowels = new char[] { 'a', 'o', 'u', 'i', 'e', 'y' };
	
	
	public void input(String s) {
		String[] tmpStr = s.split("\n");
		
		for ( String item : tmpStr )
			this.inputStrings.add(item);
	}
	
	public void process() {
		int count;
		
		for ( String str : this.inputStrings ) {
			count = 0;
			for ( int i = 0; i < str.length(); i++) {
				for ( char c : vowels ) {
					if ( c == str.charAt(i) )
						count++;
				}
			}
			this.vowelCounts.add(count);
		}
	}
	
	
	public void output() {
		for ( int item : this.vowelCounts ) {
			System.out.print(item + " ");
		}
	}
}
