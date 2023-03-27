package JavaProgrames;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int vowels = 0, consonants = 0;
        
        String str = "Automation Testing";
        
        str = str.toLowerCase();
        
        int len = str.length();
        
        for(int i=0; i<len; i++)
        {
        	char ch = str.charAt(i);
        	
        	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        	{
        		vowels++;
        	}
        	else 
        	{
        		consonants++;
        	}
        }
        
        System.out.println("Count of Vowels : " + vowels);
        
        System.out.println("Count of Consonants : " + consonants);
	}

}
