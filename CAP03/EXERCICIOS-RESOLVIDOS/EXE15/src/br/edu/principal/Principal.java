package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;
		System.out.println("Insira, na ordem - Preço de fábrica, o Percentual do Distribuidor e o Percentual dos Impostos");
		p_fab = sc.nextDouble();
		perc_d = sc.nextDouble();
		perc_i = sc.nextDouble();
		vlr_d = p_fab * perc_d/100;
		vlr_i = p_fab * perc_i/100;
		p_final = p_fab + vlr_d + vlr_i;
		System.out.println("O valor do distribuidor é de R$" + vlr_d);
		System.out.println("O valor dos impostos é de R$" + vlr_i);
		System.out.println("O preço final do produto é de R$" + p_final);
		
		
	}

}
