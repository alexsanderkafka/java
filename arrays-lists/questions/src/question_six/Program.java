package question_six;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// abaixo da media
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		System.out.println();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += numbers[i];
		}
		
		double media = sum / n;
		System.out.printf("MEDIA DO VETOR --> %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (numbers[i] < media) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();
	}

}
