package AbstractionConcept;

public abstract class Bank {

	//Static, Non-static, Final variable can be define in abstract class
	int amt =100;
	final int rate =10;
	static int 	loanrate =5;
	//partial abstraction
	//hiding the implementation logic 
	//Abs class can have abs method and non-abs method
	public abstract void loan(); //abstract method-- no method body
	
	//non-abstract methods
	public void credit() {
		System.out.println("Credit Method -Bank");
	}
	
	public void Debit() {
		System.out.println("Debit Method -Bank");
	}
}
