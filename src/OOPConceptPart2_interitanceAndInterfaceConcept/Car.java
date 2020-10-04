package OOPConceptPart2_interitanceAndInterfaceConcept;

public class Car extends Vehicle{
	//method hidding-- cannot override static method
	//static method can be overloaded--so main method can also be overloaded
	public static void start() {
		System.out.println("Car---start");
	}
	
	public void stop() {
		System.out.println("Car---stop");		
	}
	
	public void refuel() {
		System.out.println("Car---refuel");
	}
}
