package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double ano_atual, ano_nascimento, idade_atual, idade_2050;
		System.out.println("Insira o ano em que estamos: ");
		ano_atual = sc.nextDouble();
		System.out.println("Insira o ano em que a pessoa nasceu: ");
		ano_nascimento = sc.nextDouble();
		
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		System.out.print("Hoje, essa pessoa tem " + idade_atual);
		System.out.println(" anos");
		System.out.print("Em 2050, ela terá " + idade_2050);
		System.out.println(" anos");


		
	}

}
