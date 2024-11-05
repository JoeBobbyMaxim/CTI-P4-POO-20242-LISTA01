package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Insira o valor da base e altura de um triângulo: ");
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = (base * altura)/2;
		System.out.print(area);
		
		
		
		
		
	}

}
