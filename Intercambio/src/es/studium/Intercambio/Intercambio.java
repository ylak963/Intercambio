package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio {
	public static void main(String[] args) {
		int num1, num2, aux1, aux2;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número entero:");
		num1 = teclado.nextInt();

		System.out.println("Dame otro número entero:");
		num2 = teclado.nextInt();

		aux1 = num1;
		aux2 = num2;
		num1 = aux2;
		num2 = aux1;
		System.out.println(num1);
		System.out.println(num2);
		teclado.close();
	}

}
