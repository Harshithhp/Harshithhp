import java.util.*;
class d3assi1
{
  	public static void main(String[] args) 
	{
   		Scanner sc= new Scanner(System.in);
		String s="";
		System.out.print("Enter the string");
		int n=s.length();
    		String h=s.toLowerCase();
    		System.out.println(h);
    		for (int i=0;i<n;i++ ) 
		{
    			if (h.charAt(i)=='a' || h.charAt(i)=='e' || h.charAt(i)=='i' || h.charAt(i)=='o' || h.charAt(i)=='u' )
 			{
      			System.out.println("vowels");
      			//System.out.println("Index of the vowels is : " + i);
    			}
    	      }
    		for (int i=0;i<n ;i++ ) 
   		{
      		if (h.charAt(i)!='a' || h.charAt(i)!='e' || h.charAt(i)!='i' || h.charAt(i)!='o' || h.charAt(i)!='u' ) 
			{
        			System.out.println("consent in the Strings are ");
        			//System.out.println("Index of the consent is : " + i);
      		}
    		}

    	}
}