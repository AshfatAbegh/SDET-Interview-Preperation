package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   try {
       FileReader file = new FileReader("D:\\Read.txt"); 
       
       BufferedReader buff = new BufferedReader(file);
       
       for(int i = 0; i<=1; i++) {
    	   System.out.println(buff.readLine());
       }
	  }
	   
	   catch(IOException e) {
		   e.printStackTrace();
	   }	   
 }
	
}

//CE Means Compile Time Error
