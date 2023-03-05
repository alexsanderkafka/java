import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i, quadrado, cubo;
		
		System.out.print("Digite um numero inteiro: ");
		n = sc.nextInt();
		sc.close();
		
		for (i = 1; i <= n; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.println(i + "  " + quadrado + "  " + cubo);
		}

	}

}
