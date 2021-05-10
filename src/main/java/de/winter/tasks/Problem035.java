package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Savings Calculator
 * 
 * @author dmitrij
 *
 */
public class Problem035 extends TaskSolution{
	List<Account> inputList = new ArrayList<Account>();
	List<Integer> result = new ArrayList<Integer>();

	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String curStr : tmpArr ) {
			String[] tmpStr = curStr.split(" ");
			this.inputList.add( new Account( Integer.parseInt(tmpStr[0]), Integer.parseInt(tmpStr[1]), Integer.parseInt(tmpStr[2]) ) );
		}
	}

	@Override
	public void process() {
		for ( Account curAcc : this.inputList )
			this.result.add( curAcc.getNumberOfJears() );
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( int years : this.result )
			System.out.print( years + " " );
	}
}

class Account{
	private int startingAmount;
	private int requiredSum;
	private int interestRate;
	
	public Account(int startingAmount, int requiredSum, int interestRate) {
		this.startingAmount = startingAmount;
		this.requiredSum = requiredSum;
		this.interestRate = interestRate;
	}
	
	
	public int getNumberOfJears() {
		int years = 0;
		double curSum = this.startingAmount;
		
		while ( curSum < this.requiredSum ) {
			curSum *= ( (double)(100 + this.interestRate) / 100 );
			years++;
			System.out.printf( "\n%d : %1.2f", years, curSum );
		}
		
		return years;
	}
	
	
	@Override
	public String toString() {
		return "Account [startingAmount=" + startingAmount + ", requiredSum=" + requiredSum + ", interestRate="
				+ interestRate + "]";
	}
}