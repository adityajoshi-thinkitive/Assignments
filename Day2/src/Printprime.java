
public class Printprime {
	public static void main(String[] args) {
		int a[] = { 10, 11, 17, 25 }, n, flag;
		for (int i = 0; i < a.length; i++) {
			n = a[i];
			flag = 0;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n);
			}
		}
	}

}
