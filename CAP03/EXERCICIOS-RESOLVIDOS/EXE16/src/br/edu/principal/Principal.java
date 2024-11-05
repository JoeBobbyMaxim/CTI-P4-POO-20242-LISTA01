package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		System.out.println("Insira as horas trabalhadas de um empregado: ");
		horas_t = sc.nextDouble();
		System.out.println("Insira o seu salário mínimo: ");
		vlr_sal_min = sc.nextDouble();
		
		vlr_hora_t = vlr_sal_min/2;
		vlr_sal_bru = vlr_hora_t * horas_t;
		imp = vlr_sal_bru * 3/100;
		vlr_sal_liq = vlr_sal_bru - imp;
		System.out.println("O salário líquido/recebido é de R$" + vlr_sal_liq);
		
	}

}
