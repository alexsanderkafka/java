import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		
		int n, i, num, in, out;
		System.out.print("Quantos numeros você vai digitar? ");
		n = scc.nextInt();
		in = 0;
		out = 0;
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			num = scc.nextInt();
			
			if (num >= 10 && num <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		

	}

}
