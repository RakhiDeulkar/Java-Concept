package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		//cannot create obj of Interface
		//Car c = new Car();
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
		//c.theftsafety(); // specify method to BMWf
	}

}
