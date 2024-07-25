import java.util.*;
class leapYear
{
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        if(year%4==0)
         System.out.println(" leap year"+year);
         else
         System.out.println(" not leap year"+year);
    }
}