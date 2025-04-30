package Aula12;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nomes[] = new String[5];

		for (int i = 0; i <= 5; i++) {
			System.out.print("informe um nome: ");
			nomes[i] = ler.next();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("OS NOMES SAO: " + nomes[i]);
		}
		ler.close();
	}
}
