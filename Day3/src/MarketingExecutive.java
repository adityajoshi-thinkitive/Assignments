
public class MarketingExecutive extends Employee1 {

	double tour_allowance, phone_allowance;
	int kms_travelled;

	public MarketingExecutive() {

	}

	public MarketingExecutive(String ename, double basicSalary, double medical, int kms_travelled) {
		super(ename, basicSalary, medical);
		this.kms_travelled = kms_travelled;
		this.tour_allowance = 5 * kms_travelled;
		this.phone_allowance = 1500;
	}

	@Override
	public double calculateGrossSalary() {
		this.grossSalary = super.calculateGrossSalary() + this.tour_allowance + this.phone_allowance;
		return this.grossSalary;
	}

}
