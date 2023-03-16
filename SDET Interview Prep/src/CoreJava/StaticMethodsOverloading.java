package CoreJava;

public class StaticMethodsOverloading {
	
	public static void showData(String name) {
		
		System.out.println("person name:" + name);
	
	}
	
    public static void showData(int age) {
		
		System.out.println("age of the person:" + age);
	
	}

	public static void main(String[] args) {
		
		StaticMethodsOverloading.showData("Araf");
		StaticMethodsOverloading.showData(30);	  
	}
}

//static method overloading by changing number of arguments