package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeesPoliformismo;
import entities.OutsourcedEmployee;

public class ProgramPolimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<EmployeesPoliformismo> list = new ArrayList<>();

		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee" + i + " data:");
			System.out.print("Outsourced (y/n)?:");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour:");
			sc.nextLine();
			int hours = sc.nextInt();
			System.out.print("Value per hour:");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Additional charge:");
				double addtionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, addtionalCharge));
			} else {
				list.add(new EmployeesPoliformismo(name, hours, valuePerHour));
			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (EmployeesPoliformismo emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%2/n", emp.payment()));
		}

		sc.close();

	}

}
