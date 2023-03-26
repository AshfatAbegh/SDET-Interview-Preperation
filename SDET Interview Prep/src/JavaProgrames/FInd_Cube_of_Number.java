package JavaProgrames;

import java.util.Scanner;

public class FInd_Cube_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num, cube;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number:");
        
        num = sc.nextInt();
        
        cube = num*num*num;
        
        System.out.println("Cube of given number " + num + " = " + cube);
	}

}
