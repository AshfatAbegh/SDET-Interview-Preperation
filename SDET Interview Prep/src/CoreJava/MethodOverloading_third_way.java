package CoreJava;

public class MethodOverloading_third_way {
	
	public void printSalary(String name, int age) {
		System.out.println("name of the person:" + name + "age of the person:" + age);
	}
	
	public void printSalary(int salary, String name) {
		System.out.println("salary of the person:" + name +"\n"+ "name of the person:" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
