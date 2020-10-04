package JavaBasics;

public class B extends A{

	//******super keyword is use tom call parent class constructor***********
	
	public B() {
		//parent class default constructor will be called
		//super(20); //parent class param constructor will be called
		//super(10,20);
		System.out.println("Child Class Constructor");
		//super(10);//constructor call is always the first statement in constructor
	}
	public B(int r) {
	super(r);
	}
	public B(int s, int q) {
	super(s,q);
	}
	
	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(20,30);

	}

}
