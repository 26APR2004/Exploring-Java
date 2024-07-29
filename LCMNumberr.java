/ LCM=a*b/GCD
import java.util.*;

class LCMNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
         System.out.println("Enter the second number :");
        int b=sc.nextInt();
        int uper=a*b;
        
        for(int i=1;i<=a && i<=b;++i)
         if(a%i==0 && b%i==0)
            gcd=i;
            
            int lcm=uper/gcd;
           System.out.println("LCM of a anb b is:"+lcm);
         System.out.printf("GCD of %d anb %d is:%d",a,b,gcd);

         
    }
}
