import java.util.Scanner;

public class d2assi2{

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
               
        for(int i=0;i<n;i++)    
        {
            for(int j=i+1;j<n;j++)    
            {
                if(arr[i]<arr[j])     
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        	System.out.println("Second Largest element is "+arr[1]);
		System.out.println("Largest element is "+arr[0]);   
        	System.out.println("Smallest element is "+arr[n-1]);   
    }
}