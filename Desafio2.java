package Aula12;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5];
		int soma = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe o valor : ");
			a[i] = ler.nextInt();
			soma = soma + a[i];

		}
		if (soma> 15) {
			System.out.print("soma dos valores ->" + soma);
		}
		ler.close();
	}

}
