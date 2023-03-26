package JavaProgrames;

import java.util.Scanner;

public class Find_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num, i;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter any number:");
       
       num = sc.nextInt();
       
       for(i=1; i<num; i++)
       {
    	   if(i%2 == 0)
    	   {
    		   System.out.println(i);
    	   }
       }
	}

}
