package JavaProgrames;

import java.util.Scanner;

public class Find_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any first integer number:");
        
        num1 = sc.nextInt();
        
        System.out.print("Enter any second integer number:");
        
        num2 = sc.nextInt();
        
        if(num1>num2)
        {
        	  System.out.print("Number " + num1 + " is greater");
        }
        else if(num2>num1)
        {
        	System.out.print("Number " + num2 + " is greater");
        }
        else
        {
        	System.out.print("Both numbers are equal");
        }
	}

}
