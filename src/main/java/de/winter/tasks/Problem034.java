package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/** Binary Search
 * A * x + B * sqrt(x ^ 3) - C * exp(-x / 50) - D = 0
 * @author dmitrij
 *
 */
public class Problem034 extends TaskSolution{
	List<Double> inputListA = new ArrayList<Double>();
	List<Double> inputListB = new ArrayList<Double>();
	List<Double> inputListC = new ArrayList<Double>();
	List<Double> inputListD = new ArrayList<Double>();
	List<Double> result = new ArrayList<Double>();

	
	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			String[] tmpStr = item.split(" ");
			this.inputListA.add( Double.parseDouble( tmpStr[0] ) );
			this.inputListB.add( Double.parseDouble( tmpStr[1] ) );
			this.inputListC.add( Double.parseDouble( tmpStr[2] ) );
			this.inputListD.add( Double.parseDouble( tmpStr[3] ) );
		}
	}

	
	@Override
	public void process() {
		for ( int i = 0; i < this.inputListA.size(); i++ ) {
			this.result.add( binarySearch( this.inputListA.get(i), this.inputListB.get(i), this.inputListC.get(i), this.inputListD.get(i) ) );
		}
	}

	
	@Override
	public void output() {
		//System.out.println(this.inputListA);
		//System.out.println(this.inputListB);
		//System.out.println(this.inputListC);
		//System.out.println(this.inputListD);
		
		for ( double item : this.result )
			System.out.print(item + " ");
	}
	
	
	public double binarySearch(double a, double b, double c, double d) {
		double x = 100., xMin = 0., xMax = 100.;
		int i = 0;
		long z = 0;
		
		while ( z != ( (long) (x * 10000000) ) ) {
			z = (long) (x * 10000000);
			x = ( xMin + xMax ) / 2;
			i++;
			//z = ( a * x + b * Math.sqrt( Math.pow(x, 3) ) - c * Math.exp(-x / 50) - d );
			if ( ( a * x + b * Math.sqrt( Math.pow(x, 3) ) - c * Math.exp(-x / 50) - d ) > 0 ) {
				xMax = x;
			}
			else
				xMin = x;
			System.out.println(x + ":  " + z);
			
		}
		
		return x;
	}
}
