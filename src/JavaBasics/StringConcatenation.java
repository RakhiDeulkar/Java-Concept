package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";
		
		double d = 10.13;
		double c = 12.33;

		// + : is concatenation operator
		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(c + d);

		System.out.println(a + b + x + y); // 300HelloWorld
		System.out.println(x + y + a + b); // HelloWorld100200
		System.out.println(x + y + (a + b)); // HelloWorld300
		System.out.println(a + b + x + y + a + x + b + y); // 300HelloWorld100Hello200World
		System.out.println(a + b + x + y + a + b);  //300HelloWorld100200
		System.out.println(x + y + c + d);     //HelloWorld12.3310.13
		System.out.println("Hello World value of a is :"+a);
		System.out.println("Addition of a and b :"+(a+b)); //Addition of a and b :300
		System.out.println("Addition of a and b :"+a+b);   //Addition of a and b :100200
		
		
		// println(ln - line new) --is used to print on console with a new line
		// print -- is just used to print on console
		System.out.print("Hello selenium");
		System.out.println("Hello testing");  
		// o/p: Hello seleniumHello testing
	}

}
