package JavaProgrames;

import java.util.Scanner;

public class Print_Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num, i, j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any multiplication table number : ");
        num = sc.nextInt();
        
        for(i=num; i<=num; i++)
        {
        	for(j=1; j<=10; j++)
        	{
        		 System.out.println(i + "*" + j + "=" + i*j);
        	}
        	
        	 System.out.println("=====================");
        }
	}

}
