package Exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        int num = 1563;
        
        System.out.println(num);
	    }
		finally {
		    System.out.println("finally block");
		}
		
	     System.out.println("Outside of finally block");
  }
}
