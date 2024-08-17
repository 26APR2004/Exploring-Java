//Factorial of number  by using recursion
import java .util.*;
public class RecursiveFactorial
{
    int n;
    int factorial(int n)
    {
        if(n==0)
          return 1;
          else
          return n*factorial(n-1);
    }
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        RecursiveFactorial a=new RecursiveFactorial();
        a.n=sc.nextInt();
        System.out.println("Factorial of : "+a.n+" is :"+a.factorial(a.n));

    }
}