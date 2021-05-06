package de.winter.tasks;

import de.winter.services.TaskSolution;

/** Sum "A+B"
 * 
 * @author dmitrij
 *
 */
public class Problem001 extends TaskSolution{
	int a, b, result;

	@Override
	public void input(String str) {
		String[] tmpArr = str.split(" ");
		
		this.a = Integer.parseInt( tmpArr[0] );
		this.b = Integer.parseInt( tmpArr[1] );
	}

	@Override
	public void process() {
		this.result = this.a + this.b;
	}

	@Override
	public void output() {
		System.out.println( this.result );
	}
}
