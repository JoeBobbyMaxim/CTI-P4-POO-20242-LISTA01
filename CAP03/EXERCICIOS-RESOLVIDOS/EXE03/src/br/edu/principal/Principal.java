package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da 1a nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite o peso da 1a nota:");
		peso1 = sc.nextDouble();
		System.out.println("Digite o valor da 2a nota:");
		nota2 = sc.nextDouble();
		System.out.println("Digite o peso da 2a nota:");
		peso2 = sc.nextDouble();
		System.out.println("Digite o valor da 3a nota:");
		nota3 = sc.nextDouble();
		System.out.println("Digite o peso da 3a nota:");
		peso3 = sc.nextDouble();
		
		media = (nota1+nota2+nota3)/peso1+peso2+peso3;
		System.out.print(media);
		
		
		
	}

}
