import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Double notaOne, notaTwo;
		Double finalResult;
		Double gradeCalculation = 50.5;

		System.out.print("Digite a primeira nota: ");
		notaOne = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		notaTwo = sc.nextDouble();
		
		finalResult = notaOne + notaTwo;
		
		if(gradeCalculation > finalResult) {
			System.out.printf("%nAbaixo da média, reprovado! %.1f%n", finalResult);
		}else{
			System.out.printf("%nAcima da média, aprovado! %.1f%n", finalResult);			
		}
		
//
//		String name;
//
//		int bomDia = 17;
//
//		System.out.print("Digite seu nome: ");
//		name = sc.nextLine();
//
//		if (bomDia <= 12) {
//			System.out.println("Bom dia Sr. " + name);
//		} else if (bomDia >= 18) {
//			System.out.println("Boa noite Sr. " + name);
//		} else {
//			System.out.println("Boa tarde Sr. " + name);
//		}

		sc.close();

	}

}
