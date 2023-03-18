package question_nine;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			double media = (n1[i] + n2[i]) / 2;
			if (media >= 6) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
