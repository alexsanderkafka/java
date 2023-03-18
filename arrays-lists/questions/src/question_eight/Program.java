package question_eight;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// mais velhor
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}
		
		int pos = 0;
		int maior = age[0];
		
		for (int i = 1; i < n; i++) {
			if (age[i] > maior) {
				maior = age[i];
				pos = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA --> " + name[pos]);
		
		sc.close();
	}

}
