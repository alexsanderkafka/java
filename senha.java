
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha;
		System.out.print("Digite uma senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha invalida");
			System.out.print("Digite uma senha valida: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
