package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class LongSubString_1 {

	public static String findLongestSubstring(String str) 
	{ 
	    int i; 
	    int n = str.length(); 
	    int st = 0; 
	    int currlen = 0; 
	    int maxlen = 0; 
	    int start = 0; 
	    HashMap<Character,Integer> hm = new HashMap<Character,Integer>(); 
	    hm.put(str.charAt(0), 0); 
	     
	    for (i = 1; i < n; i++) 
	    {
	         
	        if (!hm.containsKey(str.charAt(i)))
	        {
	            hm.put(str.charAt(i), i);
	        }
	        else
	        { 
	             
	            if (hm.get(str.charAt(i)) >= st) 
	            {
	                
	                currlen = i - st; 
	                if (maxlen < currlen) 
	                { 
	                maxlen = currlen; 
	                start = st; 
	                } 
	         
	                st = hm.get(str.charAt(i)) + 1; 
	            } 
	         
	            hm.replace(str.charAt(i), i);
	        } 
	    } 
	     
	    if (maxlen < i - st) 
	    { 
	        maxlen = i - st; 
	        start = st; 
	    } 
	    return str.substring(start,start + maxlen); 
	} 
	 
	
	public static void main(String[] args) 
	{
	    String str = "Welcome to PowerRouter";
	    System.out.print("The Lognest Substring is:"+findLongestSubstring(str));
	}
	}

