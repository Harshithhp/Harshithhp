public class d3assi4
{  
	public static void main(String args[])
	{  
		int a[]={1,2,-4,5,8,44,-66,23,78,9,69,-59,45,78,66,1,3,-8,45,33,-63,12,17,-19,76,79,87,96,47,48,41,56};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2!=0)
			{  
				System.out.println(a[i]);  
			}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2==0)
			{  
				System.out.println(a[i]);  
			}  
		}  
		System.out.println("+VE Numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("-VE Numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
			}
		}
	}  
}