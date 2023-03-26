package JavaProgrames;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Count_Total_Words_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string : ");
		
		str = sc.nextLine();
		
		if(str==null || str.isEmpty())
		{
		  System.out.print("Enter any non empty string : ");
		}
		else
		{
		  StringTokenizer tk = new StringTokenizer(str);
		  
	      System.out.println("Total words in a string = " + tk.countTokens());  
		}
	}

}
