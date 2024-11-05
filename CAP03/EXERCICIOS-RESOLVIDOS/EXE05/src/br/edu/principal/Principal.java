package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sal,perc, novossal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um salário: ");
		sal = sc.nextDouble();
		System.out.println("Insira o aumento percentual: ");
		perc = sc.nextDouble();
		
		novossal = sal + sal*perc/100;
		System.out.println(novossal);
		
		
		
		
		
		
	}

}
