package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Note;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Note student = new Note();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Note 1: ");
		student.note1 = sc.nextDouble();
		System.out.print("Note 2: ");
		student.note2 = sc.nextDouble();
		System.out.print("Note 3: ");
		student.note3 = sc.nextDouble();
		
		System.out.println(student);
		sc.close();
	}

}
