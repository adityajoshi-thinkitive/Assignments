
public class Employee1 {
	int empid;
	double basicSalary, HRA, PF, PT, medical, grossSalary, netSalary;
	String ename;
	static String cname = "Thinkitive";
	static int count = 1;

	public Employee1() {

		this.empid = count;
		count = count + 1;
	}

	public Employee1(String ename) {
		this();
		this.ename = ename;
	}

	public Employee1(String ename, double basicSalary, double medical) {
		this(ename);
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.HRA = 0.5 * basicSalary;
		this.PF = 0.12 * basicSalary;
		this.PT = 200;
	}

	public double calculateGrossSalary() {
		this.grossSalary = this.basicSalary + this.HRA + this.medical;
		return this.grossSalary;
	}

	public double calculateNetSalary() {
		this.netSalary = this.grossSalary - this.PF - this.PT;
		return this.netSalary;
	}

	public void printInfo() {
		System.out.println("ID : " + this.empid);
		System.out.println("Name : " + this.ename);
		System.out.println("Company : " + cname);
		System.out.println("Basic Salary : " + this.basicSalary);
		System.out.println("HRA : " + this.HRA);
		System.out.println("PF : " + this.PF);
		System.out.println("PT : " + this.PT);
		System.out.println("Medical : " + this.medical);
		System.out.println("Gross Salary : " + this.calculateGrossSalary());
		System.out.println("Net Salary : " + this.calculateNetSalary());
	}
}
