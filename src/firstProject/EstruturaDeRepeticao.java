package firstProject;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		//aqui eu faço de acumulativo onde se inicia com 0 e vou guardando os valores no campo de entrada 
		int soma = 0;

		while (x != 0) {

			soma += x;

			x = sc.nextInt();
		}

		System.out.printf("Soma dos valores digitados: " + soma);
		sc.close();
	}

}