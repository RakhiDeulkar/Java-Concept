package AbstractionConcept;

public class BMW implements Car{

	@Override //not complusory to write override annotation
	public void start() {
		System.out.println("BMW-start method");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW-stop method");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW-refuel method");
		
	}

	//non-overriden method
	public void theftsafety() {
		System.out.println("BMW-theftsafety");
	}
}
