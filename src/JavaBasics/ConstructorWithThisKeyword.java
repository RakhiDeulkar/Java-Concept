package JavaBasics;

public class ConstructorWithThisKeyword {

	// class global vars
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		// without this keyword value will be initialize to local variable
		// with this keyword we can initialize global var with current value of
		// construtor

		this.name = name; // global var = local variable
		
		//Another way to initialize the g.var without this keyword
		//name1 = name; 
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 5);

	}

}
