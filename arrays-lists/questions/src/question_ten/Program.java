package question_ten;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] h = new double[n];
		char[] sexo = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			h[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			sexo[i] = sc.next().charAt(0);
		}
		
		double menorh = h[0];
		double maiorh = h[0];
		for (int i = 1; i < n; i++) {
			if (h[i] > maiorh) {
				maiorh = h[i];
			}
			else if (h[i] < menorh) {
				menorh = h[i];
			}
		}
		
		System.out.printf("Menor altura --> %.2f%n", menorh);
		System.out.printf("Maior altura --> %.2f%n", maiorh);
		
		int count1 = 0;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'M') {
				sum += h[i];
				count1 += 1;
			}
		}
		
		double media = sum / count1;
		System.out.println("Media das alturas das mulheres --> " + String.format("%.2f", media));
				
		int count2 = 0;
		for (int i = 0; i < n; i++) {
			if(sexo[i] == 'M') {
				count2 += 1;
			}
		}
		
		System.out.println("Numero de homens --> " + count2);

		sc.close();
	}

}
