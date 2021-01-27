
public class AdvancedCalculator extends Calculator {

	public AdvancedCalculator() {

		System.out.println("ADV Calculator");
	}

	public int fact(int num) {
		int ans = 1;
		for (int i = num; i > 0; i--) {
			ans = ans * i;
		}
		return ans;
	}

	@Override
	public int div(int a, int b) {
		System.out.println(super.div(a, b));
		return a % b;
	}
//	@Override  covarient kuch to
//	public AdvancedCalculator div(int a, int b) {
//		System.out.println(super.div(a, b));
//		return a % b;
//	}
}
