import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double a, b, c;
		
		System.out.print("Digite o numero de casos testes que serao digitados: ");
		n = sc.nextInt();
		
		
		// Cada caso tem três valores 
		for (i = 0; i < n; i++) {
			System.out.println("Digite os casos: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			double media = (2 * a + 3 * b + 5* c) / 10;
			System.out.printf("Media --> %.1f\n\n", media);
			
		}
	}
}
