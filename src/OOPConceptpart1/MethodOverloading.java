package OOPConceptpart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(1, 3);
		obj.sum(12.4);
	}
	
	public static void main(int i) {
	}
	
	public static void main(int p, int q) {
	}
	
	//we can overload main method
	//you cannot create method inside method
	//duplicate methods-- same method name with same no. of arguments are not allowed
	
	//method overloading - ->when method name is same with diff argument or input para within the same class
	
	public void sum() { //
		System.out.println("sum method- zero input para");
	}
	
	public void sum(int i, int j) {
		System.out.println("sum method- two input para");
		System.out.println(i+j);	
	}

	public int sum(double i, int j) {
		System.out.println("sum method- two input para");
		System.out.println(i+j);	
		return 20;
	}
	
	public void sum(int k) {
		System.out.println("sum method- one input para");
		System.out.println(k);
	}
	public void sum(double j) {
		System.out.println("sum method- one input para--diff datatype");
		System.out.println(j);
	}
}
