// Cheak the give number is even and multiple of 11
import java.util.*;
class demo_nestedif
{
    static public void main(String...args)
    {
        Scanner j=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=j.nextInt();
        int number;
        if(n%2==0)
        {
            System.out.println("number is even");
           if(n%11==0)
           {System.out.println("number is multiple of 11");}
           else
           {System.out.println("number is not multiple of 11");}
            
            
        }
        else
        {
            System.out.println("number is odd");
            if(n%11==0)
           {System.out.println("number is multiple of 11");}
           else
           {System.out.println("number is not multiple of 11");}
        }
        
    }
}
   
