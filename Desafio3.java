package Aula12;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];

		for (int i = 0; i <= 3; i++) {
			System.out.println("informe um valor para o vetor A: ");
			a[i] = ler.nextInt();
			System.out.println("informe um valor para o vetor B: ");
			b[i] = ler.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			c[i] = a[i];
			c[i + 2] = b[i];
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("vetoar a: " + a[i]);
			System.out.println("vetoar b: " + b[i]);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("vetor  c:" + c[i]);
		}

	}

}
