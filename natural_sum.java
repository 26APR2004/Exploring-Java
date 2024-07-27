// This program display the addition of natural numbers
import java.util.Scanner;
class natural_sum
{
    static public void main(String...args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to you want sum :");
        int number=sc.nextInt();
        System.out.printf(" natural number up to %d is:\n",number);
        for(int i=1;i<=number;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.printf("Sum of natural number up to %d is:%d\n",number,sum);
    }
}