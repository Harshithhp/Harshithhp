import java.util.Scanner;
class d2assi3
{
	 public static void main(String args[])
	{
    	 	 Scanner sc=new Scanner(System.in);     
         	 System.out.println("Enter the size of the array");
         	 int n=sc.nextInt();  
        	 int arr[]=new int[n];  
        	 System.out.println("Enter the array");  
        	for(int i=0;i<n;i++)     
        	{
           		 arr[i]=sc.nextInt();
        	}
        	for (i=0;i<arr.length;i++)
	  	{
            	sum += arr[i];
    	  	}
        		System.out.println("Sum of given array is: "+ sum());
      }
}

