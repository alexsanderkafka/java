import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double x, y;
		System.out.print("A quantidade pares de numeros que serao digitados: ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite o numerador: ");
			x = sc.nextDouble();
			System.out.print("Digite o denominador: ");
			y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				double div = x / y;
				System.out.printf("DIVISAO --> %.1f\n", div);
			}
		}
		
		sc.close();

	}

}
