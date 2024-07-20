// find biggest number among three values
import java.util.*;
class biggest
{
    static public void main(String...args)

    {
        Scanner k=new Scanner(System.in);
        
        System.out.println("Enter the first value");
        int s=k.nextInt();
        System.out.println("Enter the second value");
        int b=k.nextInt();
        System.out.println("Enter the third value");
        int l=k.nextInt();
        
        if(s>b && s>l)
        {
          System.out.println("s greater");
        }
        else if(b>s && b>l)
        {
            System.out.println("b is greater");
        }
        else
         { System.out.println("l is greater");}
    }
}
