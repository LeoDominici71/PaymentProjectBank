package programa;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Clients;
import entities.Emp;
import services.EmpServi;
import services.NormalServ;
import services.VanGoghServ;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero: ");

		int number = sc.nextInt();

		System.out.println("Data (dd/MM/yyyy) : ");

		LocalDate date = LocalDate.parse(sc.next(), fmt);

		System.out.println("Valor do emprestimo");

		double totalValue = sc.nextDouble();

		Emp emp = new Emp(number, date, totalValue);

		System.out.println("Entre com o numero de parcelas que gostaria de pagar");

		int n = sc.nextInt();

		System.out.println("Voce e cliente VanGogh?");

		char ch = sc.next().charAt(0);

		sc.nextLine();

		if (ch == 'y') {

			EmpServi empservi = new EmpServi(new VanGoghServ());

			empservi.processContract(emp, n);

			System.out.println("Parcelas: ");

			for (Clients client : emp.getClient()) {
				System.out.println(client);

			}

		} else {

			EmpServi empservi1 = new EmpServi(new NormalServ());

			empservi1.processContract(emp, n);

			System.out.println("Parcelas: ");

			for (Clients client : emp.getClient()) {
				System.out.println(client);

			}

		}

		sc.close();
	}

}
