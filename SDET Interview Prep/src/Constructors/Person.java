package Constructors;

//First Way - Constructor overloading by changing number of arguments
public class Person {
	
	/*Person(String name)
	{
		System.out.println("Name of the person:" + name);
    	
	}
	
	Person(String name, int voterid)
	{
		System.out.println("Name of the person:" + name);
		System.out.println("VOterid of the person:" + voterid);
    	
	}*/

//Second Way - By changing data types

     /*Person(String name, String address)
     {
	  System.out.println("Name of the person:" + name);
	  System.out.println("VOterid of the person:" + address);
	
     }
     
     Person(String name, int age)
     {
	  System.out.println("Name of the person:" + name);
	  System.out.println("VOterid of the person:" + age);
	
     }*/
	
//Third Way - By changing order of parameters
	
	Person(String address, int voterid)
    {
	  System.out.println("Address of the person:" + address);
	  System.out.println("VOterid of the person:" + voterid);
	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Person p1 = new Person("Ashfat", "Dhaka");
         
         //Person p2 = new Person("Araf", 25);
         
         Person p3 = new Person("Dhaka", 647652);
	}

}
