package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario newFun = new Funcionario();
		
		System.out.print("Name: ");
		newFun.name = sc.nextLine();
		System.out.print("Gross salary: ");
		newFun.salary = sc.nextDouble();
		System.out.print("Tax: ");
		newFun.tax = sc.nextDouble(); 
		
		System.out.println();
		System.out.println("Employee: " + newFun);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double in = sc.nextDouble();
		newFun.increaseSalary(in);
		
		System.out.println();
		System.out.println("Updated date: " + newFun);
		
		sc.close();
	}

}
