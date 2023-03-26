package JavaProgrames;

import java.util.Scanner;

public class Check_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        
        num = sc.nextInt();
        
        if(num%2 == 0)
        {
        	 System.out.print("Given number " + num + " is even");
        }
        else
        {
        	 System.out.print("Given number " + num + " is odd");
        }
	}

}
