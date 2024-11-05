package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double dep, taxa, rend, total;
		
		System.out.println("Insira o valor do depósito e da taxa de juros: ");
		dep = sc.nextDouble();
		taxa = sc.nextDouble();
		rend = dep*taxa/100;
		total = dep + rend;
		System.out.println(rend);
		System.out.println(total);
		
	}

}
