
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ssc = new Scanner(System.in);
		
		int n, i;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = ssc.nextInt();
		
		double[] vet = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = ssc.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
		System.out.println();
		
		double soma, media;
		soma = 0;
		for (i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / n;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		ssc.close();
	}
}
