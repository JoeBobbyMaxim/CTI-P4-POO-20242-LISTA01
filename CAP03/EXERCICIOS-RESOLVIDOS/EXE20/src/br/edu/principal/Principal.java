package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double ang, alt, escada, radiano;
		System.out.println("Insira, na ordem: o ângulo na escada, e a altura da parede");
		ang = sc.nextDouble();
		alt = sc.nextDouble();
		radiano = ang*3.14/180;
		escada = alt/radiano;
		System.out.println("A altura da escada em metros é de " + escada);
		
		
		
		
		
	}

}
