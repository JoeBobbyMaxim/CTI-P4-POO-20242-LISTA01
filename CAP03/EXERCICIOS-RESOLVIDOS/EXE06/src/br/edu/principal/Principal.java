package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sal, grat, imp, salreceber;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um salário: ");
		sal = sc.nextDouble();
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		
		
		System.out.println(salreceber);
		
		
		
		
	}

}
