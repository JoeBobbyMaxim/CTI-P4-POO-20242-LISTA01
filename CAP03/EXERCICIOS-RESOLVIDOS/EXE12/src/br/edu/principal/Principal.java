package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, r1, r2;
		System.out.println("Insira dois números: ");
		num1 = sc.nextDouble();
		while (num1 <= 0){
			System.out.print("Inválido - tente novamente: ");
			num1 = sc.nextDouble();
		}
		num2 = sc.nextDouble();
		while (num2 <= 0){
			System.out.print("Inválido - tente novamente: ");
			num2 = sc.nextDouble();
		}
		r1 = Math.pow(num1, num2);
		r2 = Math.pow(num2, num1);
		System.out.println(r1);
		System.out.println(r2);
		
		
		
		
		
	}

}
