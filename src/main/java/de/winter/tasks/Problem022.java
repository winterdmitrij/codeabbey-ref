package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Two Printers
 * 
 * @author dmitrij
 *
 */
public class Problem022 extends TaskSolution{
	List<Task> inputList = new ArrayList<Task>();
	List<Long> result = new ArrayList<Long>();
	
	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			String[] tmpStr = item.split(" ");
			
			this.inputList.add( new Task( Integer.parseInt(tmpStr[0]),  Integer.parseInt(tmpStr[1]), Integer.parseInt(tmpStr[2]) ) );
		}
	}

	
	@Override
	public void process() {
		for ( Task task : this.inputList )
			this.result.add( minTime(task) );
	}

	
	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( long item : this.result )
			System.out.print( item + " " );
	}
	
	
	public long minTime(Task task) {
		long time;
		int t1 = task.getTimeA(), t2 = task.getTimeB();
		int x2, x1, x = task.getNumberOfPages();
		
		if ( t1 < t2 ) {
			x2 = ( x * t1 ) / ( t2 + t1 );
			x1 = x - x2;
		}
		else {
			x1 = ( x * t2 ) / ( t2 + t1 );
			x2 = x - x1;
		}
		
		time = ( x1 * t1 > x2 * t2 ) ? x1 * t1 : x2 * t2;
		
		if ( (x1 * t1) < (x2 * t2) ) {
			if ( ( (x1 + 1) * t1 ) <  time ) {
				x1++;
				x2--;
			}
		}
		else if ( (x2 * t2) < (x1 * t1) ) {
			if ( ( (x2 + 1) * t2 ) <  time ) {
				x2++;
				x1--;
			}
		}

		time = ( x1 * t1 > x2 * t2 ) ? x1 * t1 : x2 * t2;
		//System.out.println(task);
		//System.out.println( x1 + " Pages for " + x1 * t1 + " sec; " + x2 + " Pages for " + x2 * t2 + " sec. Min Time: " + time + " for " + (x1 + x2) + " Pages");
		
		return time;
	}
}


class Task{
	int timeA, timeB, numberOfPages;

	public Task(int timeA, int timeB, int numberOfPages) {
		this.timeA = timeA;
		this.timeB = timeB;
		this.numberOfPages = numberOfPages;
	}
	
		
	public int getTimeA() {
		return timeA;
	}

	public int getTimeB() {
		return timeB;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}


	@Override
	public String toString() {
		return "(timeA= " + timeA + ", timeB= " + timeB + ", NumberOfPages= " + numberOfPages + ")";
	}
}