package firstProject;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "Alexsander Hugo Gonçalves de Souza";

		System.out.println(name.toUpperCase());

		System.out.println(name.toLowerCase().replace('a', 'y'));

		String[] vect = name.split(" ");

		String one = vect[0];
		String two = vect[1];
		String three = vect[4];

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);

		double y = 65.0;
		double x = Math.sqrt(y);
		System.out.printf("%.2f%n", x);
		double z = Math.sqrt(x);
		System.out.printf("%.2f%n", z);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = max(a, b, c);

		showResult(result);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Result " + value);
	}
}












