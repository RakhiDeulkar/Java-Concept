package OOPConceptpart1;

public class StaticAndNonStaticConcept {

	// Global var--the scope of global var will be available across all the functions with some conditions
	
	String name = "Rakhi"; // non- static variable
	static int age = 25; // static variable

	public static void main(String[] args) {
		
		// How to call static methods and vars?
		
		// 1. direct calling:
		sum();
		
		// 2. calling by classname:
		StaticAndNonStaticConcept.sum();

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// How to call non static method and var:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.add();
		System.out.println(obj.name);
		
		// Can I access static method by using object reference ? yes
		obj.sum(); //warning will be given
	}

	public static void sum() { // static method
		System.out.println("static method");
	}

	public void add() { // non-static method
		System.out.println("non-static method");
	}
}
