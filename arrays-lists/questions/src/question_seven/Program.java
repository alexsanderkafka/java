package question_seven;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// media pares
		
		System.out.print("Quantos elementos vai ter o vator? ");
		int n = sc.nextInt();
		
		int[] par = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			par[i] = sc.nextInt();
		}
		
		int sum = 0;
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if(par[i] % 2 == 0) {
				sum += par[i];
				cont += 1;
			}
		}
		
		if (sum > 0) {
			double media = (double) sum / cont;
			System.out.println("MEDIA DOS PARES --> " + media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
