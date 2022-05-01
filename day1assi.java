import java.util.*;
public class day1assi
{ 
        public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
		String r="";
		System.out.println("Enter the string");
            String s = sc.next();
            for(int i=s.length()-1;i>=0;i--)
		{
       		 r = r + s.charAt(i);
  		}

   	      if(r.equals(s)) 
		{
        		System.out.println("Is a palindrome");
   		}
   		 else 
		{
        		System.out.println("Not a palindrome");
    		}
   	  }
}