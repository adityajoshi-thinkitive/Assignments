
public class GradeCalculator {
	public static void main(String[] args) {
		int marks = 75;
		if (marks >= 70) {
			System.out.println("Distinction");
		} else if (marks >= 60) {
			System.out.println("First Class");
		} else if (marks >= 50) {
			System.out.println("Second Class");
		} else if (marks >= 40) {
			System.out.println("Pass Class");
		} else {
			System.out.println("Fail");
		}
	}

}
