package JavaProgrames;

import java.util.Scanner;

public class String_Characters_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
        int count = 0,i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any string : ");
        
        str = sc.nextLine();
        
        for(i = 0; i<str.length(); i++)
        {
        	if(str.charAt(i)!=' ')
        	{
        		count++;
        	}
        }
        
        System.out.println("Total Number of Characters in a String : " + count);
	}

}
