package OOPConceptpart1;

public class CallByValAndCallByRef {
int p;
int q; 
	public static void main(String[] args) {

		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.sum(x, y);// call by value or pass by value
		
		obj.p=50;
		obj.q=40;
		obj.swap(obj);// call by reference
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	// passing of argument or input para we are passing
	public int sum(int a, int b) { // duplicate copy of x and y is give to a and b
		a = 30;
		b = 40;
		int c = a + b;
		System.out.println(c); // 70
		return c;
	}
	
	//call by reference --by using obj reference
	public void swap(CallByValAndCallByRef t) { //obj =t ; t is reference variable
		int temp;
		temp=t.p ;
		t.p =t.q;
		t.q =temp;		
	}
}
