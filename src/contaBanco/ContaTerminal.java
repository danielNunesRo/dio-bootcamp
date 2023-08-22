package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Por favor, digite o número da Agência!");
			int numeroAgencia = sc.nextInt();
			System.out.println("Por favor, digite a sua Agência: ");
			sc.nextLine();
			String nomeAgencia = sc.nextLine();
			System.out.println("Por favor, digite o nome do cliente: ");
			String nomeCliente = sc.nextLine();
			System.out.println("Por favor, digite seu saldo: ");
			Double saldo = sc.nextDouble();
			
			System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível");

	}

}
