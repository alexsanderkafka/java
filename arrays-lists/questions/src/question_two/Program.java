package question_two;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] h = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			h[i] = sc.nextDouble();
		}
		
		System.out.println();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += h[i];
		}
		
		double med = sum / n;
		System.out.printf("Altura média: %.2f%n", med);
		
		double menores = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				menores += 1;
			}
		}
		
		double porcentagem = (menores / n) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		for (int i = 0; i < n; i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
