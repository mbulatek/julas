package ex_1;

public class ex_1
{

	public static void main(String[] args)
	{
		/*
		 * This is a comment it is not part of your program!!!
		 */
		System.out.println("Hello World!!!");
		
		/*
		 * Exercise 1
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 1");
		System.out.println(" */");

		WorkingClass		c = new WorkingClass();
		
		c.variables();

		
		/*
		 * Exercise 2
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 2");
		System.out.println(" */");
		
		int		result;
		
		result = c.returningValue();
		System.out.println("Method c.returnungValue() returned: " + result);
		
		
		/*
		 * Exercise 3
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 3");
		System.out.println(" */");
		
		result = c.add(16, 32);
		System.out.println("Method c.add() returned: " + result);

		/*
		 * Exercise 4
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 4");
		System.out.println(" */");

		result = c.mult(8, 16);
		System.out.println("Method c.mult() returned: " + result);

		/*
		 * Exercise 5
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 5");
		System.out.println(" */");

		double	doubleResult;
		
		doubleResult = c.hypotenuseLength(3, 4);
		System.out.println("Method c.hypotenuseLength() returned: " + doubleResult);
		
		/*
		 * Exercise 6
		 */
		System.out.println("");
		System.out.println("/*");
		System.out.println(" * Exercise 6");
		System.out.println(" */");
		
		/*
		 * Write code which call your method and print out a result
		 */

}

}
