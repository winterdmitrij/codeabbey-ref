package de.winter.tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import de.winter.services.TaskSolution;

/**Body Mass Index
 * 
 * @author comline
 *
 */
public class Problem028 extends TaskSolution{
	List<BodyMass> inputBodyMassList = new ArrayList<BodyMass>();
	List<String> result = new ArrayList<String>();
	
	@Override
	public void input(String str) {
		StringTokenizer st = new StringTokenizer(str, " \n");
		List<String> tmpList = new ArrayList<String>();
		
		while ( st.hasMoreTokens() ) {
			tmpList.add(st.nextToken());
		}
		System.out.println(tmpList);
		
		for ( int i = 0; i < tmpList.size(); i += 2) {
			this.inputBodyMassList.add( new BodyMass( Integer.parseInt( tmpList.get(i) ), Double.parseDouble( tmpList.get(i+1) ) ) );
		}
	}

	@Override
	public void process() {
		for ( BodyMass bm : inputBodyMassList ) {
			this.result.add( bm.getBmiGrade() );
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputBodyMassList);
		
		for ( String str : this.result ) {
			System.out.print( str + " " );
		}
	}
}

class BodyMass{
	private int weight;
	private double bodySize;
	private double bmi;
	
	public BodyMass(int weight, double bodySize) {
		this.weight = weight;
		this.bodySize = bodySize;
		this.bmi = this.weight / Math.pow( this.bodySize, 2 );
	}
	
	public int getWeight() {
		return weight;
	}
	
	public double getBodySize() {
		return bodySize;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBmiGrade() {
		if ( this.bmi < 18.5 )
			return "under";
		else if ( this.bmi < 25.0 )
			return "normal";
		else if ( this.bmi < 30.0 )
			return "over";
		else
			return "obese";
	}

	public String toString() {
		return this.weight + "kg, " + this.bodySize + "m, " + this.bmi + "; ";
	}
}