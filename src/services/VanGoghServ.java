package services;

public class VanGoghServ implements EmpOnline{
	
	private static final double VGFEE_PERCENTAGE = 0.005;
	private static final double VGMONTHLY_INTEREST = 0.005;
	
	@Override
	public double paymentFee(double amount) {
		return amount * VGFEE_PERCENTAGE;
	}
	
	@Override
	public double interest(double amount, int months) {
		return amount * VGMONTHLY_INTEREST * months;
	}

}
