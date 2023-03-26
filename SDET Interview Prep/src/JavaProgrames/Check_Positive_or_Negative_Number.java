package JavaProgrames;

import java.util.Scanner;

public class Check_Positive_or_Negative_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter any number: ");
        
        num = sc.nextInt();
        
        if(num>=0)
        {
        	  System.out.println("You have entered positive number");
        }
        else 
        {
        	 System.out.println("You have entered negative number");
        }
	}

}
