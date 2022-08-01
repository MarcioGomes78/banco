package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Account acc = new Account();
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		System.out.print("Titulae: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Saldo Inicical: ");
		double balance = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double withDrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		System.out.println();
		
		System.out.print("Inform a quantia para sacar: ");
		double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		
		sc.close();
	}

}
