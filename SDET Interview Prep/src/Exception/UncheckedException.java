package Exception;

public class UncheckedException {

	public static void main(String[] args) {
	   
		try{
		String a = "Ashfat";
		
		String b = "Araf";
		
		String c = null;
		
	    System.out.println("First Name:" + a);
	    System.out.println("Second Name:" + b);
	    System.out.println("Last Name:" + null);
	    
	    System.out.println("Doing Concatination Operation:" + c.concat(b));
		
		}
		
	    catch(NullPointerException e) { 
	       System.out.println("Null Pointer Exception");
	    }
  }
	
}

//UncheckedException Means Run Time Error
