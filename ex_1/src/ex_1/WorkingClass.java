package ex_1;

public class WorkingClass
{
	/*
	 * This method illustrates how to declare variables and assign values to them
	 */
	void variables()
	{
		String		stringVariable;
		int			integerVariable1, integerVariable2;
		double		realVariable;
		boolean		logicalVariable;

		stringVariable = "Hello Julek";
		
		System.out.println(stringVariable);
		
		integerVariable1 = 32;
		integerVariable2 = 64;
		
		System.out.println("integerVariable1 = " + integerVariable1);
		System.out.println("integerVariable2 = " + integerVariable2);
		
		integerVariable1 = integerVariable1 + 8;

		System.out.println("integerVariable1 = " + integerVariable1);

		
		realVariable = 3.5;
		
		System.out.println("realVariable = " + realVariable);
		
		logicalVariable = true;
		
		System.out.println("logicalVariable = " + logicalVariable);

		logicalVariable = false;
		
		System.out.println("new value of logicalVariable = " + logicalVariable);
	}
	
	/*
	 * This method illustrates how to return value
	 */
	int returningValue()
	{
		int		a;
		
		a = 128;
		
		return a;
	}
	
	/*
	 * This method illustrates how to passing arguments to method,
	 * performing some operations and return value.
	 * This particular method takes two arguments (a and b), adds them
	 * and returns a result
	 */
	int add(int a, int b)
	{
		int			sum;
		
		sum = a + b;
		
		return sum;
	}
	
	/*
	 * Write a method which multiplies two values passed as arguments
	 * and returns a result
	 */
	int mult(int a, int b)
	{
		int result;
		
		/*
		 * Replace the following line with your code
		 */		
		result = 0;		
		
		
		return result;
	}
	
	/*
	 * Write a method which takes lengths of two cathetuses of 
	 * right triangle and returns length of hypotenuse
	 * 
	 * Hint: use Math.sqrt() method which takes one argument
	 * and returns value of double
	 */
	double hypotenuseLength(int a, int b)
	{
		double result;
		
		/*
		 * Replace the following line with your code
		 */		
		result = 0;
		
		return result;
	}
	
	/*
	 * Write a method which takes time and distance
	 * and return value of speed
	 */
	double speed(int distance, int time)
	{
		double result;
		
		/*
		 * Replace the following line with your code
		 */		
		result = 0;
		
		return result;
	}
	
	/*
	 * Write a method (you can choose it's name) which takes
	 * three arguments of type int - initial speed, final speed
	 * and time. Your method calculates acceleration for taken
	 * values and returns value of acceleration (type of return
	 * value shall be double
	 */
	
	/*
	 * Replace this comment with your code
	 */
	
	/*
	 * This method takes two values of int and
	 * returns true if values are equal, otherwise
	 * returns false
	 */
	boolean compare(int a, int b)
	{
		boolean result;
		
		if ( a == b )
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}
}
