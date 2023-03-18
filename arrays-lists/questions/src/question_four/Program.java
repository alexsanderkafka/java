package question_four;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// maior posicao
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		double maior = vet[0];
		int pos = 0;
		
		for (int i = 1; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pos = i;
			}
		}
		
		System.out.println("MAIOR VALOR --> " + maior);
		System.out.println("POSICAO DO MAIOR VALOR --> " + pos);
		
		sc.close();
		
	}

}
