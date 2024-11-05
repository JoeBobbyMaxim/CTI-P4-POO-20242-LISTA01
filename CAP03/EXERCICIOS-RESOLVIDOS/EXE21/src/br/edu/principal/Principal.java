package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		System.out.println("Insira, na ordem: o tamanho da escada utilizada, e a altura desejada para o quadro");
		z = sc.nextDouble();
		x = sc.nextDouble();
		while (x > z) {
			System.out.println("A altura não deve ser maior que o tamanho da escada - insira novamente");
			x = sc.nextDouble();
		}
		y = Math.pow(z, 2) - Math.pow(x, 2);
		y = Math.sqrt(y);
		System.out.print("A distância ideal da escada para a parede é de " + y);
		System.out.println(" metros");
		
		
		
	}

}
