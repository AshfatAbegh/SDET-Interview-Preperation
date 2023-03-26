package JavaProgrames;

import java.util.Scanner;

public class Swap_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Method 1: By using third variable
        
        int a,b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number a : ");
        
        a = sc.nextInt();//10
        
        System.out.print("Enter second number b : ");
        
        b = sc.nextInt();//20
        
        System.out.println("Before swaping two numbers a = " + a + " and b = " + b);
        
        /*temp = a;//temp1 = 10
        a = b; //a = 20
        
        b = temp;//b = 10*/
        
        //Method 2: Without using third variable
        
        a = a + b; // a = 10, b = 20, 10+20 = 30
        b = a - b; // 30-20 = 10
        
        a = a - b; // 30-10 = 20
        
        System.out.println("After swaping two numbers a = " + a + " and b = " + b);
	}

}
