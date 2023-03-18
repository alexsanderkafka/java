package new_question;

import java.util.Locale;
import java.util.Scanner;

import util.Rooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many room will be rented? ");
		int n = sc.nextInt();		
		Rooms[] vect = new Rooms[10];
		
		String nam, ema;
		int ro;
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			nam = sc.nextLine();
			System.out.print("E-mail: ");
			ema = sc.next();
			System.out.print("Room: ");
			ro = sc.nextInt();
			
			vect[ro] = new Rooms(nam, ema, ro);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		sc.close();
	}

}
