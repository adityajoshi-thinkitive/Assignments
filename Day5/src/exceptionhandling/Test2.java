package exceptionhandling;

public class Test2 {

	public static void main(String[] args) {
		hello();
	}

	public static void hello() throws InsufficientBalanceException {

		int age = 12;
		if (age > 18 && age < 35) {
			System.out.println("Admission Succesful");
		} else {
			InvalidAgeException i = new InvalidAgeException();
			throw i;
		}

		int balance = 4000;
		if (balance > 5000) {
			System.out.println("Sufficient balance");
		} else {

			InsufficientBalanceException i = new InsufficientBalanceException();
			throw i;
		}
	}
}
