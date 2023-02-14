
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, num2;
		
		System.out.println("Digite dois numeros: ");
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		while (num != num2) {
			if (num > num2) {
				System.out.println("DECRESCENTE");
			}
			else {
				System.out.println("CRESCENTE");
			}
			
			System.out.println("Digite outros dois numeros: ");
			num = sc.nextInt();
			num2 = sc.nextInt();
		}
		
		sc.close();
		
	}
}
