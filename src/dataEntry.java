import java.util.Scanner;
import java.util.Locale;

public class dataEntry {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double largura = sc.nextDouble();
		Double comprimento = sc.nextDouble();
		Double metroQuadrado = sc.nextDouble();
		
		Double area = largura * comprimento;
		Double price = area * metroQuadrado ;
		
		System.out.printf("Digite a largura do terreno: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", price);
//		System.out.printf("%nArea do terreno: %.2f%n", largura * comprimento);
//		System.out.printf("Preço do terreno: %.2f%n", largura * comprimento);
		
		sc.close();
	}

}
