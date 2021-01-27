
public class Manager extends Employee1 {

	double food_allowance, manager_allowance, other_allowance;

	public Manager() {

	}

	public Manager(String ename, double basicSalary, double medical) {
		super(ename, basicSalary, medical);
		this.food_allowance = 0.08 * basicSalary;
		this.manager_allowance = 0.1 * basicSalary;
		this.other_allowance = 0.03 * basicSalary;
	}

	@Override
	public double calculateGrossSalary() {
		this.grossSalary = super.calculateGrossSalary() + this.food_allowance + this.manager_allowance
				+ this.other_allowance;
		return this.grossSalary;
	}

}
