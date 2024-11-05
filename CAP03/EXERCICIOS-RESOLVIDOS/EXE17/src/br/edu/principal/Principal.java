package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;
		System.out.println("Insira, na ordem: o Salário, o primeiro cheque e o segundo cheque");
		salario = sc.nextDouble();
		cheque1 = sc.nextDouble();
		cheque2 = sc.nextDouble();
		cpmf1 = cheque1 * 0.38/100;
		cpmf2 = cheque2 * 0.38/100;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("Seu saldo atual é de R$" + saldo);
		
		
		
		
		
		
	}

}
