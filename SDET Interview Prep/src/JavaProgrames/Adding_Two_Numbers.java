package JavaProgrames;
import java.util.Scanner;

public class Adding_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1, num2, sum;
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first integer number : ");
         
         num1 = sc.nextInt();
         
         System.out.print("Enter second integer number : ");
         
         num2 = sc.nextInt();
         
         sum = num1 + num2;
         System.out.println("Sum of two numbers : " + sum);
         
	}

}
