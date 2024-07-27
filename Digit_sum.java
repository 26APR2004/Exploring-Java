import java.util.*;
class Digit_sum
{
    static public void main(String...rgs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        double number=sc.nextDouble();
        System.out.println("Sum of digits:"+sumDefine( number));
    }
        static int sumDefine(double number)
       { 
           int sum=0;
           while(number!=0)
        {
           int reminder=(int)number%10;
            sum=sum+reminder;
           number=number/10;
        }
        return sum;
    }

    
}