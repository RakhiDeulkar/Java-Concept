package OOPConceptpart1;

public class Car_variableConcept {

	//Class vars: global var
	int model;
	int wheel;
	
	public static void main(String[] args) {
	
		Car_variableConcept a =new Car_variableConcept(); 
		//new Car() --this is the obj of car class
		//new keyword is used to create the object
		//a,c,b is object reference variable
		Car_variableConcept b =new Car_variableConcept(); 
		Car_variableConcept c =new Car_variableConcept(); 
		
		a.model= 2015;
		a.wheel= 4;
		
		b.model= 2016;
		b.wheel= 3;
		
		c.model= 2017;
		c.wheel= 2;
		
		System.out.println("*********before assigning the references*******");
		
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("*********after shifting the references*******");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model); //10
		c.model=20;
		System.out.println(a.model); //20
		System.out.println(c.model); //20
	}

}
