package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sal, imp, salreceber;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um salário: ");
		sal = sc.nextDouble();
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		
		
		System.out.println(salreceber);
		
		
		
		
	}

}
