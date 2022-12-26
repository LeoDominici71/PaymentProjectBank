package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Clients;
import entities.Emp;



public class EmpServi {
	
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	
	private EmpOnline emponline;

	public EmpServi(EmpOnline emponline) {
		this.emponline = emponline;
	}
	
	public void processContract(Emp emp, int months) {
		
		double basicQuota = emp.getTotalValue()/months;
		
		for(int i=1; i <= months; i++) {
			
			LocalDate dueDate = emp.getDate().plusMonths(i);
			
			double interest = emponline.interest(basicQuota, i);
			
			double fee = emponline.paymentFee(basicQuota + interest);
			
			double quota = basicQuota + interest + fee;
			
			emp.getClient().add(new Clients(dueDate, quota));
					
		}
			
	}

}
