package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/**
 * Mortgage Calculator
 * @author comline
 *
 */
public class Problem037 extends TaskSolution{
	List<Mortgage> inputList = new ArrayList<Mortgage>();
	List<Integer> result = new ArrayList<Integer>();

	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String curStr : tmpArr ) {
			String[] tmpStr = curStr.split(" ");
			this.inputList.add( new Mortgage( Integer.parseInt(tmpStr[0]), Integer.parseInt(tmpStr[1]), Integer.parseInt(tmpStr[2]) ) );
		}
	}
	

	@Override
	public void process() {
		for ( Mortgage curMort : this.inputList )
			this.result.add( curMort.getMountlyPayment() );
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( int years : this.result )
			System.out.print( years + " " );
	}
}

class Mortgage {
	private int loanSize;
	private int interestRate;
	private int payoutDuration;
	
	public Mortgage(int loanSize, int interestRate, int payoutDuration) {
		this.loanSize = loanSize;
		this.interestRate = interestRate;
		this.payoutDuration = payoutDuration;
	}

	public int getMountlyPayment() {
		int monthlyPayment = 0;
		double monthlyRate = (double) this.interestRate / 1200;
		double generalRate = (double) Math.pow( (1 + monthlyRate), this.payoutDuration );

		monthlyPayment = (int) Math.ceil( (this.loanSize * monthlyRate * generalRate) / (generalRate - 1) );

		return monthlyPayment;
	}
	
	@Override
	public String toString() {
		return "Mortgage [loanSize=" + loanSize + ", interestRate=" + interestRate + ", payoutDuration="
				+ payoutDuration + "]";
	}
}