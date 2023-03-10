package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle a = new Rectangle();
		System.out.println("Enter rectangle wifth end height: ");
		a.widht = sc.nextDouble();
		a.height = sc.nextDouble();
		
		System.out.println("Area = " + String.format("%.2f", a.area()));
		System.out.println("Perimeter = " + String.format("%.2f", a.perimeter()));
		System.out.println("Diagonal = " + String.format("%.2f", a.diagonal()));

		sc.close();
	}

}
