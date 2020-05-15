package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramSalario {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome ");
		emp.nome = sc.nextLine();
		System.out.println("Digite o salario ");
		emp.salario = sc.nextDouble();
		System.out.println("Digite o imposto ");
		emp.imposto = sc.nextDouble();
		System.out.println(emp);
		System.out.println("Which percentage to increase salary?");
		double porcentagem = sc.nextDouble();
		emp.addSalario(porcentagem);
		System.out.println("Aumento de : " + emp);
		sc.close();

	}

}
