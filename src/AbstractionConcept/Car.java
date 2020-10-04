package AbstractionConcept;

public interface Car {

	//only final and static variable  can be define in interface
	int wheels =4;// by default final and static
	
	//In interface always define abstract method
	//No method body
	//only method declaration
	//methods are by default abstract in nature-- so no need to write abstract keyword also
	//we achieve 100% abstraction --not define any business logic --only blueprint
	//cannot create object  of Interface
	public void start();
	public void stop();
	public void refuel();
}
