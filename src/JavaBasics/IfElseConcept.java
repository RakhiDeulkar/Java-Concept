package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		if (a < b) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}
		// comparision operators:
		// < > <= >= == != -- = is assignment operator 
		int c = 50;
		int d = 40;
		if (c == d) { //c=d means we are assigning value of c to d
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and d are not equal");
		}
		//write a logic to find out the highest number
		
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		//nested if-else
		//true & true =true
		//false & false =false
		//false & true = false 
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greatest");	
		}
		else if(b1>c1) {
			System.out.println("b1 is greatest");
		}
		else {
			System.out.println("c1 is greatest");
		}
	}

}
