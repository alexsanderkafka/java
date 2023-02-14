
import java.util.Scanner;

public class problema_soma_impare {
	public static void main(String[] args) {
		Scanner ssc = new Scanner(System.in);
		
		int x, y, troca, soma;
		
		System.out.println("Digite dois numeros inteiros: ");
		x = ssc.nextInt();
		y = ssc.nextInt();
		ssc.close();
		
		if (x > y){
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for (x++; x < y; x++) {
			if (x % 2 != 0) {
				soma = soma + x;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
	}
}
