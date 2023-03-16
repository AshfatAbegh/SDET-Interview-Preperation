package CoreJava;

public class MethodOverloading_first_way {
	
	public void printSalary(int salary) {
		System.out.println("salary without bonus:" + salary);
	}
	
	public void printSalary(int salary, int tax) {
		System.out.println("salary with tax:" + (salary+tax));
	}

	public static void main(String[] args) {
		

	}

}
