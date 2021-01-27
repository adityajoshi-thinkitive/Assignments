
public class Calculator {

//	public int add(int a[]) {
//		int ans = 0;
//		for (int x:a) {
//			ans = ans+x;
//		}
//		return ans;
//	}

	// we can use var args
	public int add(int... a) {
		int ans = 0;
		for (int x : a) {
			ans = ans + x;
		}
		return ans;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public float add(int a, float b) {
		return a + b;
	}

	public float add(float a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}
