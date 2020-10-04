package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop:
		//dis adv :it generate infinite loop if we dont provide incremental or decremantal part
		
		int j =1;    //initialization 
		
		while(j<=10) {  //conditional
			System.out.println(j);
			j=j+1;	//incremental/decremental
		}

		System.out.println("***************");
		
		//2. for loop:	
		for(int i=1; i<=10; i++) {  //initialization conditional incremental
			//i++ means i=i+1
			System.out.println(i);
		}
		
		System.out.println("***************");
		
		 //print 10 to 1
		//1>10 false -1>-10 true
		for(int k=10; k>=-10; k--) { //initialization conditional decremental
			System.out.println(k);
		}
	}

}
