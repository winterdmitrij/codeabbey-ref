package de.winter.tasks;

import java.util.ArrayList;
import java.util.List;

import de.winter.services.TaskSolution;

/**
 * Share Price Volatility
 * @author comline
 *
 */
public class Problem039 extends TaskSolution{
	List<SharePriceVolatility> inputList = new ArrayList<SharePriceVolatility>();
	List<String> result = new ArrayList<String>();

	@Override
	public void input(String str) {
		String[] tmpArr = str.split("\n");
		List<Integer> tmpList = new ArrayList<Integer>();
		
		for ( String curStr : tmpArr ) {
			tmpList.clear();
			String[] tmpStr = curStr.split(" ");
			for ( int i = 1; i < tmpStr.length; i++ )
				tmpList.add( Integer.parseInt( tmpStr[i] ) );
			this.inputList.add( new SharePriceVolatility( tmpStr[0], tmpList ) );
		}
	}
	

	@Override
	public void process() {
		for ( SharePriceVolatility item : this.inputList ) {
			if ( Math.abs( item.getVolatiele() ) >= 4 ) {
//				System.out.println(item.getVolatiele());
				this.result.add( item.getName() );
			}
		}
	}

	@Override
	public void output() {
		System.out.println(this.inputList);
		System.out.println();
		
		for ( String item : this.result )
			System.out.print( item + " " );
		//SLVR IMIX MARU SUGR SAKK YUKA FOTA GOLD BLEP WOWY MYTH CKCL JOOG
	}
}

class SharePriceVolatility {
	private String name;
	private List<Integer> priceVolatility = new ArrayList<Integer>();

	public SharePriceVolatility(String name, List<Integer> priceVolatility) {
		this.name = name;
		for ( int item : priceVolatility )
			this.priceVolatility.add(item);
	}

	protected String getName() {
		return name;
	}


	public double getVolatiele() {
		double provision = ( ( this.priceVolatility.get(0) + this.priceVolatility.get(13) ) / 2 ) * 0.01;
		System.out.println( this.name + ": " + provision + " - " + ( this.priceVolatility.get(13) - this.priceVolatility.get(0) ) / provision );
		return ( ( this.priceVolatility.get(13) - this.priceVolatility.get(0) ) / provision );
	}



	@Override
	public String toString() {
		return "\nSharePriceVolatility [name=" + name + ", priceVolatility=" + priceVolatility + "]";
	}
}