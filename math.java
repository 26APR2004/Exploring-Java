import java.util.*;
class math
{
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value :");
        int a=sc.nextInt();
        System.out.println("Enter the second value :");
        int b=sc.nextInt();

        System.out.println("Largest number is:"+Math.max(a,b)); //Use of max
         System.out.println("Smallest number is:"+Math.min(a,b));//Use of min
         float div=a/b;
          System.out.println("Division in rounded is:"+Math.round(div));
           System.out.println("Squreroot number is:"+Math.sqrt(a));
            System.out.println("Cuberoot number is:"+Math.cbrt(b));
             System.out.println("power number is:"+Math.pow(a,b));
    }
}