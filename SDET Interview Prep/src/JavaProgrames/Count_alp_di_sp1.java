package JavaProgrames;

import java.util.Scanner;

public class Count_alp_di_sp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String aldisp_str;
        
        int i,alph = 0,digi,sp1;
        
        i=digi=digi=sp1=0;
        
        char ch;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter alpha neumeric string : ");
        
        aldisp_str = sc.nextLine();
        
        while(i<aldisp_str.length())
        {
        	ch = aldisp_str.charAt(i);
        	
        	if(ch>='a' && ch<='z' || ch>='A' && ch<= 'Z')
        	{
        		alph++;
        	}
        	else if(ch>= '0' && ch<='9')
        	{
        		digi++;
        	}
        	else 
        	{
        		sp1++;
        	}
        	
        	i++;
        	
        	System.out.println("Number of alphabets characters = "+alph);
        	
        	System.out.println("Number of digits characters = "+digi);
        	
        	System.out.println("Number of special characters = "+sp1);
        }
	}

}
