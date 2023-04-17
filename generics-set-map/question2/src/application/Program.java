package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Students> a = new TreeSet<>();
		Set<Students> b = new TreeSet<>();
		Set<Students> c = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			a.add(new Students(cod));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			b.add(new Students(cod));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cod = sc.nextInt();
			c.add(new Students(cod));
		}
		
		Set<Students> union = new TreeSet<>(a);
		union.addAll(b);
		union.addAll(c);
		System.out.println("Total students: " + union.size());
		
		sc.close();
	}

}
