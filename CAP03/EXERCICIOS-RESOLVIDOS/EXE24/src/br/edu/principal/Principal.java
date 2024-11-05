package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float hora, m, conversao;
		System.out.println("Insira um horário (ex: para 4 e meia, 4,3): ");
		hora = sc.nextFloat();
		int h = (int) hora;
		m = hora - h;
		conversao = Math.round((h*60) + (m*100));
		System.out.print(hora + " equivale a " + conversao + " minutos");
		
		
		
		
		
		
	}

}
