package JavaProgrames;

import java.util.Scanner;

public class Print_1_to_100_Without_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using loop
        int num, i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        
        num = sc.nextInt();
        
        
        for(i=num; i<=100; i++)
        {
        	System.out.println(i);
        }
        
        //printnumbers(num);
	}
	
	//without using loop
	/*public static void printnumbers(int num)
	{
		if(num<=100)
		{
			 System.out.println(num);
			 printnumbers(num+1);
		}
	}*/

}
