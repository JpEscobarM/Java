package application;
import java.util.Scanner;

import br.ucs.poo.tratamentoexceções.exercicios.Account;

import java.util.Locale;

public class Program {
	public static void  main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: " );
		int number = input.nextInt();
		System.out.println("Titular: ");
		input.nextLine();
		String holder = input.nextLine();
		System.out.println("Saldo Inicial: ");
		input.nextLine();
		double balance = input.nextDouble();
		System.out.println("Limite de saque: ");
		double lwithdrawLimit = input.nextDouble();
		
		Account c = new Account(number, holder, balance, lwithdrawLimit);
		
		System.out.print("");
		System.out.println("Informe uma quantia para sacar: ");
		double amount = input.nextDouble();
		c.withdraw(amount);
		
	}

}
