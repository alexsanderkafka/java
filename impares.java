import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		
		sc.close();
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		

	}

}
