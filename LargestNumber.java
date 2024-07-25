// Java program to find Largest Among three numbers 
import java.util.*;
class LargestNumber
{
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a:");
        int a=sc.nextInt();
        System.out.println("Enter the b:");
        int b=sc.nextInt();
        System.out.println("Enter the c:");
        int c=sc.nextInt();
        //Ternary operator
        if(a>b && a>c)
        System.out.println("Largest value is:"+a);
        else if(b>a && b>c)
        System.out.println("Largest value is:"+b);
        else
        System.out.println("Largest value is:"+c);
    }
}
