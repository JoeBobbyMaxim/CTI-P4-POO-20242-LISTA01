package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double pes, polegadas, jardas, milhas;
		System.out.println("Quantos pés?");
		pes = sc.nextDouble();
		
		polegadas = pes*12;
		jardas = pes/3;
		milhas = jardas/1760;
		System.out.println(polegadas);
		System.out.println(jardas);
		System.out.println(milhas);
		
		
		
	}

}
