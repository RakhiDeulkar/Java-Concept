package OOPConceptpart1;

public class FinallyConcept {

	public static void main(String[] args) {
      //test1();
		//test2();
		division();
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException();
		}
		catch(Exception e) {
			System.out.println("Inside test1 catch");
		}
		
		finally {
			System.out.println("Inside finally of start1");
		}
	}
	
	//****** Without Exception*******
	public static void test2() {
		try {
			System.out.println("Inside test2 method");
		}
//		catch(Exception e) {
//			System.out.println("Inside test2 catch");
//		}
//		
		finally {
			System.out.println("Inside finally of start2");
		}
	}

	//****** With RealTime Exception- finally will be called always*******
	public static void division() {
		int i=10;
		try {
			System.out.println("Inside try");
			int k=i/0;  //Gives Arithmetic Exception
		}
//		catch(ArithmeticException e){
//			System.out.println("Inside catch");
//			System.out.println("Divide by zero");
//		}
		// k=i/0 will not be catch
		catch(NullPointerException e){ //catch block will not execute
			System.out.println("Inside catch");
		}
		//finally is a block
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
}	
