package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/** Modulo and time difference
 * 
 * @author comline
 *
 */
public class Problem012 extends TaskSolution{
	List<Date> inputList = new ArrayList<Date>();
	List<Date> DatesA = new ArrayList<Date>();
	List<Date> DatesB = new ArrayList<Date>();
	List<Date> result = new ArrayList<Date>();
	
	
	@Override
	public void input(String str) {
		StringTokenizer st = new StringTokenizer(str, " \n");
		List<Integer> tmpList = new ArrayList<Integer>();
		
		while ( st.hasMoreTokens() )
			tmpList.add( Integer.parseInt( st.nextToken() ) );
		
		for ( int i = 0; i < tmpList.size(); i += 8 ) {
			this.DatesA.add( new Date( tmpList.get(i), tmpList.get(i+1), tmpList.get(i+2), tmpList.get(i+3) ) );
			this.DatesB.add( new Date( tmpList.get(i+4), tmpList.get(i+5), tmpList.get(i+6), tmpList.get(i+7) ) );
		}
	}

	@Override
	public void process() {
		for ( int i = 0; i < this.DatesA.size(); i++ ) {
			this.result.add( longToDate( dateToLong ( this.DatesB.get(i) ) - dateToLong( this.DatesA.get(i) ) ) );
		}
	}

	
	@Override
	public void output() {
		System.out.println(this.DatesA);
		System.out.println(this.DatesB);
		for ( Date date : this.result )
			System.out.print( date + " " );;
	}

	
	public long dateToLong(Date date) {
		return ( date.getSecond() + date.getMinute() * 60 + date.getHour() * 3600 + date.getDay() * 3600 * 24 );
	}
	
	public Date longToDate(long sec) {
		int day, hour, minute, second;
		
		day = (int) ( sec / ( 3600 * 24 ) );
		sec %= ( 3600 * 24 );
		
		hour = (int) ( sec / 3600 );
		sec %= 3600;
		
		minute = (int) ( sec / 60 );
		sec %= 60;
		
		second = (int) sec;
		
		return new Date(day, hour, minute, second);
	}
}

class Date {
	private int day, hour, minute, second;

	public Date(int day, int hour, int minute, int second) {
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	
	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}


	public String toString() {
		return "(" + this.day + " " + this.hour + " " + this.minute + " " + this.second + ")";
	}
}
