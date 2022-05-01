public class d3assi3{

     public static void main(String args[])
	{
		String s="java is a platform independent";
		String s1 = "";
		String[] data = s.split("\\s");
		for (int i=s.length()-1;i>=0;--i) 
		{
   			s1 += s.charAt(i);
		}
			System.out.println(s1);
		for(String mydata : data)
		{
			System.out.println(mydata);
		}
	}		
}