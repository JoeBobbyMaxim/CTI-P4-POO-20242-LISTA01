package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double quad, cubo, r2, r3;
		int num;
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		while (num <= 0){
			System.out.print("Inválido - tente novamente: ");
			num = sc.nextInt();
		}
		quad = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("número^2: " + quad);
		System.out.println("número^3: " + cubo);
		System.out.println("número 2raiz: " + r2);
		System.out.println("número 3raiz: " + r3);
		
	}

}
