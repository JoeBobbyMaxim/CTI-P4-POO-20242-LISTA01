package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double peso_saco, racao_gato1, racao_gato2, total_final;
		System.out.println("Insira, na ordem: o peso do saco de ração, a quantidade de ração do 1º gato, e a do 2º gato");
		peso_saco = sc.nextDouble();
		racao_gato1 = sc.nextDouble();
		racao_gato2 = sc.nextDouble();
		racao_gato1 = racao_gato1/1000;
		racao_gato2 = racao_gato2/1000;
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		System.out.print("A quantidade de ração restante é de " + total_final);
		System.out.print(" gramas");
		
		
		
	}

}
