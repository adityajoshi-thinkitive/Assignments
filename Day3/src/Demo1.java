
public class Demo1 {
	public static void main(String[] args) {
		// Calculator c = new Calculator();
		// System.out.println(c.add(10, 90));
//		AdvancedCalculator ac = new AdvancedCalculator();
//		System.out.println(ac.div(50, 3));
		// System.out.println(ac.fact(6));
		Calculator c = new AdvancedCalculator();
		System.out.println(c.div(50, 3));
		// System.out.println(c.fact(5)); can't do this
		// because parent class reference can't access
		// subclass members

	}
}
