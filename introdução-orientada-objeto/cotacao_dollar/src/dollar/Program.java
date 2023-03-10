package dollar;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cc.unDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", cc.converter());
		
		sc.close();
	}

}
