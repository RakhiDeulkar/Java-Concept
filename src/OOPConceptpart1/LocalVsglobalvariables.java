package OOPConceptpart1;

public class LocalVsglobalvariables {

	// Global or Class variable(declared immediate after class)
	String name = "tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10;// local variable for main method
		System.out.println(i);
		LocalVsglobalvariables obj = new LocalVsglobalvariables();

		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();
	}

	public void sum() {
		int i = 15; // local variable for sum method
		int j = 20;
		System.out.println(j);
		System.out.println(i);

	}
}
