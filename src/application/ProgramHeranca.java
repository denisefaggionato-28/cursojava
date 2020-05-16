package application;

import java.util.ArrayList;
import java.util.List;

import entities.AccountHeranca;
import entities.BusinessAccount;
import entities.EmployeesPoliformismo;
import entities.SavingsAccount;

public class ProgramHeranca {

	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount();
		AccountHeranca acc = new AccountHeranca(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1102, "maria", 0.0, 500.0);

		// UPCASTING

		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccount(1004, "Anna", 0.0, 300.0);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc4.loan(200.0);
			System.out.println("Loan! ");

		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update! ");

		}
		// SOBREPOSICAO

		AccountHeranca acc6 = new AccountHeranca(1006, "João", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());

		AccountHeranca acc7 = new SavingsAccount(1006, "João", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());

		AccountHeranca acc8 = new BusinessAccount(1006, "João", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

		// POLIMORFISMO

		AccountHeranca x = new AccountHeranca(1020, "Denise", 1000.0);
		AccountHeranca y = new SavingsAccount(1023, "teste", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}



}
