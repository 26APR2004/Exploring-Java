package Array_DS;
import java.util.Scanner;
public class SqurePattern {
	public static void numberTriangle(int n)
	{
		int num=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" "+num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void vShape(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=n-i-1;j++)
				System.out.print(j);
			
			for(int j=1;j<=2*i+1;j++)
				System.out.print(" ");
			
			for(int j=n-i-1;j>=1;j--)
				System.out.print(j);
			
			System.out.println();
		}
	}
	public static void binaryTriangle(int n)
	{
		int start;
	    for(int i=0;i<=n;i++)
	    {
	    	   if(i%2==0) start=1;
	    	   else
	    		   start=0;
	    	   
	      	for(int j=0;j<i;j++)
	     	{
	    		   System.out.print(start);
	    		   start=1-start;
	    	     }
	      	System.out.println();
	    }
	}
	public static void halfDiamond(int n)
	{
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n; i>=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void diamond(int n)
	{
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			for(int j=0;j<2*i+1;j++)
				System.out.print("*");
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			for(int j=0;j<2*i+1;j++)
				System.out.print("*");
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			System.out.println();
		}
	}
	public static void revPyramid(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			for(int j=0;j<2*i+1;j++)
				System.out.print("*");
			
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			
			System.out.println();
		}
	}
	public static void pyramid(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			} 
		    for (int j = 0; j<2*i+1; j++)
		    {
		        System.out.print("*");
		    }
		
		    for(int j=0;j<n-i-1;j++)
		    {
		      	System.out.print(" ");
		     }
		System.out.println();
		}
	}
	public static void revRightTriangleNum(int n)
	{
		for(int i=n;i>0;i--)
		{
			for (int j = 1; j <= i; j++) {
				  System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void revRightTriangle(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for (int j = n; j >i; j--) {
				  System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightTriangleNumS(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for (int j = 1; j <=i; j++) {
				  System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void rightTriangleNum(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for (int j = 1; j <=i; j++) {
				  System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void rightTriangle(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for (int j = 0; j <i; j++) {
				  System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void squrePattern(int n)
	{
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++) 
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");
		int num=sc.nextInt();
//		squrePattern(num);
//		rightTriangle(num);
//		rightTriangleNum(num);
//		rightTriangleNumS(num);
//		RevRightTriangle(num);
//		RevRightTriangleNum(num);
//		Pyramid(num);
//		RevPyramid(num);
//		diamond(num);
//		halfDiamond(num);
//		binaryTriangle(num);
//		vShape(num);
		numberTriangle(num);
		sc.close();
	}

}
