import java.util.Locale;
import java.util.Scanner;

public class CalcImposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//abaixo de 3k isento
		//3k até 5k 10%
		//5k acima 20%
		
		int annualSalary = sc.nextInt();
		
//		annualSalary = annualSalary * 12;
		
		if(annualSalary <= 3000) {
			System.out.println("isento");
		}else if(annualSalary > 3001 && annualSalary < 5000) {
			System.out.println("Seu imposto é de 10% resultando em  " + annualSalary * 0.10);
			
		}else if(annualSalary > 6001) {
			System.out.println("Seu imposto é de 20% resultando em  " + annualSalary * 0.20);
		}
		
		
		sc.close();
		
	}

}
