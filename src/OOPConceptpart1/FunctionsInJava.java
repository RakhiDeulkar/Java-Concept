package OOPConceptpart1;

public class FunctionsInJava {

	// main method -->starting point of execution
	//mian method does not return any value, hence it is void
	public static void main(String[] args) { 
		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created ,obj is the reference variable , referring to that
		// object
		// after creating the object, the copy of all non- static method will be given to this object
		
		obj.test();
		
		int l= obj.pqr();
		System.out.println(l);
		
		String s=obj.qa();
		System.out.println(s);
		
		int d=obj.division(10, 5);
		System.out.println(d);
		
		String h = obj.sendmail(10,"sel");
		System.out.println(h);
		
		//main method is void ---- never write return statement inside main()i.e. never returns value

	}

	// non-static method
	// void -- does not return any value
	// return type =void

	// 1. no input ,no output
	public void test() {
		System.out.println("Test Method");
		
		//can not create function under function
		//functions are independent to each other
		//functions are parallel  to each other
		
//		public int add() {
//			
//		}
	}

	// 2. no input some output
	// return type =int
	public int pqr() {
		System.out.println("PQR Mathod");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	public String qa() { // return type --> string
		System.out.println("qa Method");
		String s = "Selenium";
		return s;
	}

	// 3. some input some output
	// x,y -- input arguments/parameters
	public int division(int x, int y) { // retun type --> int
		System.out.println("division method");
		int d = x / y;
		return d;
	}
	
	public String sendmail(int p, String q) {
		System.out.println();
		String h=p+q;
		return h;
	}
}
