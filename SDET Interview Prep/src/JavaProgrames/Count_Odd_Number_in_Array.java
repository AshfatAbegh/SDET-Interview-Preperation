package JavaProgrames;

import java.util.Scanner;

public class Count_Odd_Number_in_Array {

	public static void main(String[] args) {
	  
		int size, i, oddCount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of elements in an array");
		
		size = sc.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Please Enter " + size + " Elements of array: ");
		
		for(i=0; i <size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("List of Odd Numbers in an array");
		
		for(i=0; i<size; i++)
		{
			if(a[i]%2!= 0)
			{
				System.out.println(a[i] + " ");
				
				oddCount++; 
			}
		}
		
		System.out.println("\n Total number of odd numbers present in this array: " + oddCount);
	}

}
