package OOPConceptpart1;

public class FinalizeConcept {

	public void finalize(){
		System.out.println("finalize method");
	}
	//finalize is a method
	
	public static void main(String[] args) {
		
		FinalizeConcept f = new FinalizeConcept();
		FinalizeConcept f1 = new FinalizeConcept();
		
		f = null;
		f1 = null;
		
		//GC will destroy the object with no reference  -- to free some space
		//finalize method will be called to perform cleanup memory processing of object
		System.gc();
			
	}

}
