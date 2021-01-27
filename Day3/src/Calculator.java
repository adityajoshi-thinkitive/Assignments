/**
 * This is simple calculator
 * 
 * @author thinkitive
 *
 */
public class Calculator {
	public Calculator() {

		System.out.println("Calculator");
	}

	/**
	 * This method adds two numbers and produce answer
	 * 
	 * @param a is the first input
	 * @param b is the second input
	 * @return ans in int format as addition of a and b
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * This method subtract second number from first number and produce answer
	 * 
	 * @param a is the first input
	 * @param b is the second input
	 * @return ans in int format as subtraction of a and b
	 */
	public int sub(int a, int b) {
		return a - b;
	}

	/**
	 * This method multiply two numbers and produce result
	 * 
	 * @param a is the first input
	 * @param b is the second input
	 * @return ans in int format as multiplication of a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}
