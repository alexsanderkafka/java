import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, fat, i;
		System.out.println("Digite um numero para calcular o fatorial: ");
		n = sc.nextInt();
		
		fat = 1;
		for (i = n;  i > 0; i--) {
			fat = fat * i;
		}
		
		
		System.out.println("Fatorial --> " + fat);
		
		sc.close();
		

	}

}
