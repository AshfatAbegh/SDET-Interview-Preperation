package JavaProgrames;

import java.util.Scanner;

public class Rectangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int rows,columns,i,j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows : ");
        
        rows = sc.nextInt();
        
        System.out.print("Enter number of columns : ");
        
        columns = sc.nextInt();
        
        for(i=1; i<=rows; i++)
        {
        	for(j=1; j<=columns; j++)
        	{
        	  System.out.print("*");
        	}
        	
        	  System.out.print("\n");
        }
	}

}
