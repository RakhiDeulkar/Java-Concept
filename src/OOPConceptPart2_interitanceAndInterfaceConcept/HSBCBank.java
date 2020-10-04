package OOPConceptPart2_interitanceAndInterfaceConcept;

public class HSBCBank implements USBank, BrazilBank{  // we are achieving multiple inheritance
	//Is-a relationship- Inerface and class relationship
	
//if a class implementing any Interface, it is mandatory to define/override all the methods of Interface
	
	//Overriding from USBank :
	public void credit() {
		System.out.println("HSBC--credit");
	}
	public void debit() {
		System.out.println("HSBC--debit");
	}
	public void transferMoney() {
		System.out.println("HSBC--Transfer Money");
	}
	
	//Seperate methods of HSBCBank:
	public void educationLoan() {
		System.out.println("HSBC--Education loan");
	}
	public void carLoan() {
		System.out.println("HSBC--Car loan");
	}
	 
	//Overridding from BrazilBank:
	public void mutualFund() {
		System.out.println("HSBC--mutualFund");
	}
}
