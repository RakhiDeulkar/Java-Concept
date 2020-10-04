package OOPConceptPart2_interitanceAndInterfaceConcept;

public interface USBank extends BrazilBank{

	int min_bal = 100;
	public void credit(); //only declaration of method
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body--only method prototype
	//in Interface, we can declare the variables, and vars are by default static in method
	//vars value will not be changed  ---final/constant in nature
	//no static methods in Interface
	//no main method in Interface
	//we cannot create the objcet of Interfaces 
	//Interface is abstract in nature
}
