package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
		System.out.println("Insira, na ordem: O valor de um salário mínimo, e a quantidade de kilowatts gastos");
		vlr_sal = sc.nextDouble();
		qtd_kw = sc.nextDouble();
		vlr_kw = vlr_sal/5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15/100;
		vlr_desc = vlr_reais - desc;
		System.out.println("o valor de um quilowatt é de R$" + vlr_kw);
		System.out.println("o valor a ser pago é de R$" + vlr_reais);
		System.out.println("o valor com desconto é de R$" + vlr_desc);
		
		
	}

}
