import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		System.out.print("Digite um valor para calcular todos os seus divisores: ");
		n = sc.nextInt();
		sc.close();
		
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

}
