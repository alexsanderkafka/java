import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// cod
		// 1     alcool
		// 2     gasolina
		// 3     diesel
		// 4     fim

		int cod, al, gas, die;
		
		System.out.print("Digite o codigo do produto: ");
		cod = sc.nextInt();
		
		al = 0;
		gas = 0;
		die = 0;
		while (cod != 4) {
			switch(cod) {
			case 1:
				al += 1;
				break;
			case 2:
				gas += 1;
				break;
			case 3:
				die += 1;
				break;	
			}
			
			System.out.print("Digite o codigo do produto: ");
			cod = sc.nextInt();
		}
		
		System.out.println("\nMUITO OBRIGADO!");
		System.out.println("Alcool --> " + al);
		System.out.println("Gasolina --> " + gas);
		System.out.println("Diesel --> " + die);
		sc.close();
	}

}
