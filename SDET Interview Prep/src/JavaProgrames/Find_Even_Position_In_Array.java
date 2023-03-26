package JavaProgrames;

public class Find_Even_Position_In_Array {

	public static void main(String[] args) {
	
		int array[] = new int[] {10,20,30,40,50,60,70,80,90,100};
		
		
		//even numbers always starts with 2
		
		for(int i = 2; i<array.length; i = i+2)
		{
			System.out.println("Position:" + i);
			
			System.out.println("Value:" + array[i]);
		}

	}

}
