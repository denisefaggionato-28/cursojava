package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculater;

public class ProgramCirc {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculater.circumference(radius);
		double v = Calculater.volume(radius);
		System.out.printf("Circunference: %2f%n", c);
		System.out.printf("Volume: %2f%n", v);
		System.out.printf("PI value: %2f%n", Calculater.PI);
		
		sc.close();
	}
	
	

}
