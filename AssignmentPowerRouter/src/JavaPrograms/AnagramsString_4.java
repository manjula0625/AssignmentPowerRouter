package JavaPrograms;

import java.util.Arrays;

public class AnagramsString_4 {

	public static void main(String[] args) {
		String s1= "welcome";
		String s2 = "ceelmow";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		if(c1.length != c2.length)
		{
			System.out.println("The Strings are NOT Anagrams");
			System.exit(0);
		}
         Arrays.sort(c1);
         Arrays.sort(c2);
         for(int i=0;i<c1.length;i++)
         {
        	 if(c1[i] !=c2[i])
        	 {
        		 System.out.println("The Strings are NOT Anagrams");
        		 System.exit(0);
        	 }
         }
         System.out.println("The Strings are Anagrams");
	}

}
