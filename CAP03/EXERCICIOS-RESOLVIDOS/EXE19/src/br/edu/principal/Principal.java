package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a_degrau, a_usuario, qtd_degraus;
		System.out.println("Insira a altura de um degrau: ");
		a_degrau = sc.nextDouble();
		System.out.println("Insira a altura que uma pessoa deseja alcançar na escada: ");
		a_usuario = sc.nextDouble();
		qtd_degraus = a_usuario/a_degrau;
		System.out.print("Serão necessários " + qtd_degraus);
		System.out.println(" degraus");
		
	}

}
