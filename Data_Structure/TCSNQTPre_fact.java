package dataStructure;
import java.util.ArrayList;
import java.util.Scanner;
public class TCSNQTPre_fact {
	public static boolean isPrime(int N)
	{
		if(N<=1) return false;
		
		for(int i=2;i<=Math.sqrt(N);i++)
		  {if(N%i==0)
			return false;}
		return true;
	}
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Enter the Number: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <=N; i++) {
			if(N%i==0 && isPrime(i))
			arr.add(i);
		}
		System.out.println(arr);
	}
}

