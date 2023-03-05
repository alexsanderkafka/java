import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite a coordenada x: ");
		x = sc.nextInt();
		System.out.print("Digite a coordenada y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			
			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO Q1\n");
			}
			else if(x < 0 && y > 0) {
				System.out.println("SEGUNDO Q2\n");
			}
			else if(x < 0 && y < 0) {
				System.out.println("TERCEIRO Q3\n");
			}
			else {
				System.out.println("QUARTO Q4\n");
			}
			
			System.out.print("Digite a coordenada x: ");
			x = sc.nextInt();
			System.out.print("Digite a coordenada y: ");
			y = sc.nextInt();
			
			
		}
		
		sc.close();
		

	}

}
