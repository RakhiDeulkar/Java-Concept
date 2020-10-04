package OOPConceptPart2_interitanceAndInterfaceConcept;

public class BMW extends Car {  //"has a relationship"

	/*
	 * when same method is present in parent class as well as in child class with
	 * same name and same no. of arguments, is called Method Overriding
	 */
	
	public static void start() {//Overidden method has preference
		System.out.println("BMW---start");
	}

	public void theftSafety() {
		System.out.println("BMW---theft");
	}
}
