package JavaProgrames;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int i, number;
		
		long factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any number to find factorial!");
        number = sc.nextInt();
        
        for(i=1; i<=number; i++)
        {
        	factorial = factorial*i;	
        }
        System.out.format("\n factorial of %d = %d", number, factorial);
	}

}
