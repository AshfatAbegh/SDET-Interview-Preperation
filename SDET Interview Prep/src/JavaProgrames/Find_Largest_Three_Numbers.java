package JavaProgrames;

import java.util.Scanner;

public class Find_Largest_Three_Numbers {

	public static void main(String[] args) {
	 
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any three different values");
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.format("\n %d number is greater than %d and %d:", x,y,z);
		}
		else if(y>x && y>z)
		{
			System.out.format("\n %d number is greater than %d and %d:", y,x,z);
		}
		else if(z>x && z>y)
		{
			System.out.format("\n %d number is greater than %d and %d:", z,x,y);
		}
		else {
			System.out.println("All the values are same");
		}
	}

}
