package OOPConceptPart2_interitanceAndInterfaceConcept;

public class TestCar {

	public static void main(String[] args) {

		// ****static polymorphism -- compile time polymorphism******

		// at compile time java decides which method to be called
		BMW b = new BMW();
		b.start(); // preference given to child class start method
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("*****************************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		// parent cannot access all child class method

		System.out.println("*****************************");

		// *****dynamic polymorphism --run Time Polymorphism*********

		// Top casting
		Car c1 = new BMW();// overriden method and parent class method will be called using dynamic
							// polymorphism

		/*
		 * child class object can be referred by parent class reference variable--
		 * dynamic polymorphism --run Time Polymorphism
		 */

		c1.start();
		c1.stop();
		c1.refuel();
		// c1.theftSafety method is not accessible

		// Down casting
		BMW b1 = (BMW) new Car();  //ClassCastException
		// parent cannot be fit into child class ref var
		// at rum time --class cast exception--ar cannot be cast to BMW
		// making decreding cast of car class or parent into child class object and then reffered
		// by child class reference variable
		//(BMW) new Car() -- BMW class object
		
		Vehicle v = new Car(); 
		v.engine();
		
	

	}

}
