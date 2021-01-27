
public class TestEmployee1 {
	public static void main(String[] args) {

		Employee1 e = new Employee1("Sunil", 10000, 2000);
		Employee1 e1 = new Manager("Anil", 10000, 2000);
		Employee1 e2 = new MarketingExecutive("Ramesh", 10000, 2000, 50);

		Employee1 arr[] = { e, e1, e2, new Employee1(), new Employee1("Mahesh", 5000, 1200) };
		for (Employee1 temp : arr) {
			temp.printInfo();
		}
	}
}
