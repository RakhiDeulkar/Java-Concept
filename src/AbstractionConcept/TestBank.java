package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
	
		ICICIBank obj = new ICICIBank();
		obj.credit();
		obj.Debit();
		obj.loan();
		obj.Funds();
		
		Bank obj1 = new ICICIBank();
		obj1.credit();
		obj1.Debit();
		obj1.loan();
		//obj1.Funds();
		
		//cannot create obj of abstract class
		//Bank b = new Bank();
	}

}
