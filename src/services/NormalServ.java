package services;

public class NormalServ implements EmpOnline {
	private static final double FEE_PERCENTAGE = 0.01;
	private static final double MONTHLY_INTEREST = 0.05;
	
	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
    

}
