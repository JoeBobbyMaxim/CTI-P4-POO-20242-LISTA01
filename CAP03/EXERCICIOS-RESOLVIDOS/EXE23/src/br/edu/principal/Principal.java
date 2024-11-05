package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num, f, a;
		System.out.println("Insira um número real: ");
		num = sc.nextDouble();
		int i = (int) num;
		f = num  - i;
		a = Math.round(num);
		System.out.println("Parte inteira: "+i);
		System.out.println("Parte fracionada: "+f);
		System.out.println("Número arredondado: "+a);
		
			
		
		
	}

}
