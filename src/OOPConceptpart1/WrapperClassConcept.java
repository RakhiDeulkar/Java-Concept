package OOPConceptpart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// DataConversion using Wrapper classes
		String s = "100";
		System.out.println(s + 10);

		// data conversion :
		// String to int:
		int i = Integer.parseInt(s); // Interger-->wrapper class
		System.out.println(i + 10);

		// Interger, Double, Boolean,(Character -- no parse method available)

		// String to double:
		String x = "12.33";
		System.out.println(x + 10);

		double d = Double.parseDouble(x);
		System.out.println(d + 10);

		// String to boolean
		String k = "true";
		System.out.println(k);
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to String:
		int j = 200;
		System.out.println(j + 10);

		String st = String.valueOf(j); // "200"
		System.out.println(st + 10);
		
		String u ="100A";
		Integer.parseInt(u);  //Exception: NumberFormatException-- for input string:"100A"
	}

}
