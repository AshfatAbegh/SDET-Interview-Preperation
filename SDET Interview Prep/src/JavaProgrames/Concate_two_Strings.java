package JavaProgrames;

import java.util.Scanner;

public class Concate_two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//using in built function
		
		String str1, str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string : ");
		
		str1 = sc.nextLine();
		
		System.out.print("Enter second string : ");
		
		str2 = sc.nextLine();
		
		String str3 = str1.concat(str2);
		
		System.out.print("Concatenated rsult : " + str3);
	}

}
