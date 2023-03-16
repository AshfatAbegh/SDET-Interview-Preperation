package CoreJava;

public class MethodOverloading {
  
		public void printSalary(int salary) {
			System.out.println("salary without bonus:" + salary);
		}
				
		public void printSalary(int salary, double bonus) {
			System.out.println("salary with bonus:" + (salary+bonus));
		}


        public static void main(String[] args) {

    	MethodOverloading ol = new MethodOverloading();
    	
    	ol.printSalary(5000);
    	ol.printSalary(5000, 2000);
  }

}

/*By 3 ways we can overload any method
1. By changing number of arguments
2. By changing data types  in arguments
3. By changing order of parameters*/
