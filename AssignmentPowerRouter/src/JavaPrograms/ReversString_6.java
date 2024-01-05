package JavaPrograms;

public class ReversString_6 {

	public static void main(String[] args)
	{
	  String s = "welcome";
	  String revers = "";
	  System.out.println("The string before Revers:"+s);
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  revers = revers+s.charAt(i);
	  }
       System.out.println("The String after recers:"+ revers);
	}

}
