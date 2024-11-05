package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double custo, convite, qtd;
		System.out.println("Insira, na ordem: o custo de um espetáculo, e o preço de um convite para ele ");
		custo = sc.nextDouble();
		convite = sc.nextDouble();
		qtd = Math.round(custo/convite);
		System.out.print("Será necessário vender ao menos " + qtd + " convites para cobrir o custo do espetáculo");
		
	}

}
