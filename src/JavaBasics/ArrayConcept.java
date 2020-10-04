package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//array : to store similar data type values in a array variable
		//one dimentional array
		
		//1. int array:
		//lowest bound/index = 0
		//upper bound/index = n-1 (n is size of array)
		
		//dis-adv:
		//1. size is fixed -- static array - to overcome this problem -- we use Collections --like ArrayList, HastTable-- use dynamic array
		//2. stores only similar data types values -- To overcome this problem, we use Object array
		
		int i[]= new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 
		 System.out.println(i[2]);
		 System.out.println(i[3]);
		 
		// System.out.println(i[4]);//error:ArrayIndexOutOfBoundsException
		 
		 System.out.println(i.length); //size/length of array
		 
		 //print all the values of array: use for loop
		 for(int j=0; j<i.length; j++) { 
			 System.out.println(i[j]);
		 }
		 
		 //2. double array
		 double d[] = new double[3];
		 d[0] = 12.33;
		 d[1] = 13.44;
		 d[2] = 45.55;
		 System.out.println(d[2]);
		 
		 //3. char array
		 char c[] = new char[4];
		 c[0] = 'q';
		 c[1] = '2';
		 c[2] = '$';

		 System.out.println(c[1]);
		 
		 //4. boolean array;
		 boolean b[] = new boolean[2];
		 b[0] = true;
		 b[1] = false;
		 
		 System.out.println(b[1]);
		 
		 //5. String array
		 String s[] = new String[3];
		 s[1]="hello";
		 s[0]="hi";
		 s[2]="what";
		 System.out.println(s.length);
		 
		 //6. Object array: object is super class of all classes -- is use to store diff data types value
		 Object ob[] = new Object[5];
		 ob[0] = "String";
		 ob[1] = 25;
		 ob[2] = 12.3;
		 ob[3] = 'A';
		 ob[4] = "1/1/1995";
		 System.out.println(ob[4]);
	}

}
