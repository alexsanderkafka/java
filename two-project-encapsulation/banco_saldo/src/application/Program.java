package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numbers = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit(y/n)? ");
		char answer = sc.next().charAt(0);
		
		
		Bank newAcc;
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			newAcc = new Bank(holder, numbers, deposit);
		}
		else {
			newAcc = new Bank(holder, numbers);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account " + newAcc.getNumAccount()
						   + " Holder: " + newAcc.getName()
						   + ", Balance: $ " + String.format("%.2f", newAcc.getValue()));
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		newAcc.addValue(deposit);

		System.out.println();
		System.out.println("Update Account data: ");
		System.out.println(newAcc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		newAcc.removeValue(withdraw);
		
		
		System.out.println("Update Account data: ");
		System.out.println(newAcc);
		
		sc.close();
	}

}
