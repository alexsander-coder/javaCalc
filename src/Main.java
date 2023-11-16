import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale localeUS = new Locale("en", "US");
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 26;
		int code = 5290;
		char gender = 'F';
		double priceOne = 2100.0;
		
		
		
		double priceTwo = 630.50;
		double measure = 53.234567;
		
		System.out.printf("Products%n %s whice price is R$ %.1f%n %s, which price R$ %.2f%n", product1, priceOne,
				product2, priceTwo);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n Rouded (three decimal places): %.3f%n",
				measure, measure);

		Locale.setDefault(localeUS);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}