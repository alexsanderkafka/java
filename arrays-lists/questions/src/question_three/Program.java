package question_three;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// numeros pares
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				sum += 1;
				System.out.print(num[i] + " ");

			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES --> " + sum);
		
		sc.close();
		
	}

}
