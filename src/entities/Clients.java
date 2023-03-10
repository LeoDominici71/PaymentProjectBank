package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Clients {

	private LocalDate date;
	private Double amount;

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Clients(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return date + " - " + String.format("%.2f", amount);

}
}