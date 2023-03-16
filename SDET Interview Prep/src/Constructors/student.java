package Constructors;

public class student {
	
	String name;
	int rollno;
	String classnanme;
    String address;
	private String classname;
    
    student(String name, int rollno)
    {
    	this.name = name;
    	this.rollno = rollno;
    }
    
    student(String name,int rollno, String classname, String address){
     	this.name = name;
    	this.rollno = rollno;
    	this.classname = classname;
    	this.address = address;
    }
    
    public void studentdata()
    {
    	System.out.println("Name of the student:" + name);
    	System.out.println("Rollno of the student:" + rollno);
    	System.out.println("Address of the student:" + address);
    	System.out.println("Classname of the student:" + classname);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         student s = new student("Ashfat", 2);
         s.studentdata();
         
         student s1 = new student("Araf", 3, "Dhaka", "a");
         s1.studentdata();
	}

}
