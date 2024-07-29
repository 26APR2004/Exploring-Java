//The greatest common divisor (GCD) of two or more numbers is the greatest common factor number that divides them, exactly.
import java.util.*;

class GCDofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
         System.out.println("Enter the second number :");
        int b=sc.nextInt();
        
        for(int i=1;i<=a && i<=b;++i)
         if(a%i==0 && b%i==0)
            gcd=i;
           
         System.out.printf("GCD of %d anb %d is:%d",a,b,gcd);
}
}
