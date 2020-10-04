 package OOPConceptPart2_interitanceAndInterfaceConcept;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//USBank.min_bal=200;  var is final in nature  --cannot change the value
		// cannot creaye the object of Interface---USBank b = new USBank();
// Static polymorphismor or Compile time polymorphism
		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.carLoan();
		b.educationLoan();

		// Dynamic or run time polymorphism
		// child class obj can be refered by parent interface reference var

		USBank h = new HSBCBank();
		h.credit();
		h.debit();h.transferMoney();
		}

}
