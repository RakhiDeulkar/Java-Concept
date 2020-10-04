package JavaBasics;

public class ConstructorConcept {

	//constructor do not return any value
	//Duplicate constructor cannot be created
	//constructor can be overloaded
	public ConstructorConcept() {
		System.out.println("Default Const");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param Const");
		System.out.println("value of i = "+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two params Const");
		System.out.println("value of i = "+i);
		System.out.println("value of j = "+j);
	}
	
	public static void main(String[] args) {
	
		ConstructorConcept obj = new ConstructorConcept(); //this calls the default construct even through we do not declare as we always have hidden default cont
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);

	}

}
