package CoreJava;

public class MethodOverloading_second_way {
	
	public void printSalary(int salary) {
		System.out.println("salary of the person:" + salary);
	}
	
	public void printSalary(String name, String address) {
		System.out.println("name of the person:" + name +"\n"+ "address of the person:" + address);
	}

	public static void main(String[] args) {
	  
		MethodOverloading ol = new MethodOverloading();
		ol.printSalary(5000);
        
	}

}
