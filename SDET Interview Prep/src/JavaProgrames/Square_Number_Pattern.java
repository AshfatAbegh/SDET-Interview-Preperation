package JavaProgrames;

import java.util.Scanner;

public class Square_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int side, i, j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any side of a square : ");
        
        side = sc.nextInt();
        
        for(i=0; i<side; i++)
        {
        	for(j=0;j<side;j++)
        	{
        		System.out.print("2");
        	}
        	
        	 System.out.print("\n");
        }
        		
	}

}
