package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double area, raio;
		
		System.out.println("Insira o raio de um círculo: ");
		raio = sc.nextDouble();
		area = 3.1415 * Math.pow(raio, 2);
		
		System.out.println(area);
		
		
		
	}

}
