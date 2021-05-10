package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/**
 * Quadratic Equation
 * @author comline
 *
 */
public class Problem038 extends TaskSolution{
	List<Equation> inputList = new ArrayList<Equation>();
	List<String> result = new ArrayList<String>();

	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String curStr : tmpArr ) {
			String[] tmpStr = curStr.split(" ");
			this.inputList.add( new Equation( Integer.parseInt(tmpStr[0]), Integer.parseInt(tmpStr[1]), Integer.parseInt(tmpStr[2]) ) );
		}
	}

	@Override
	public void process() {
		for ( Equation curEquation : this.inputList )
			this.result.add( curEquation.getRots() );
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( String item : this.result )
			System.out.print( item + "; " );
	}

}

class Equation {
	private int a, b, c;

	public Equation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getRots() {
		String roots = "";
		int x1, x2;
		
		int sqrt = this.b * this.b - 4 * this.a * this.c;
		
		if ( sqrt >= 0 ) {
			x1 = (int) ( (0 - this.b + Math.sqrt(sqrt)) / (2 * this.a) );
			x2 = (int) ( (0 - this.b - Math.sqrt(sqrt)) / (2 * this.a) );
			if ( x1 > x2 )
				roots += x1 + " " + x2;
			else
				roots += x2 + " " + x1;
		}
		else {
			x1 = (int) ( (0 - this.b) / (2 * this.a) );
			sqrt = (int) Math.sqrt(Math.abs(sqrt)) / (2 * this.a);
			roots += x1 + "+" + sqrt + "i " + x1 + "-" + sqrt + "i";
		}
			
		return roots;
	}
	
	@Override
	public String toString() {
		return "Equation [" + a + " * x^2 + (" + b + ") * x + (" + c + ") = 0]";
	}
}