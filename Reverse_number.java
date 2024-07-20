import java.util.*;
class reverse
{
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a=sc.nextInt();
        int reverse=0;
        while(a!=0)
        {
        int  reminder=a%10; //1234%10=4
            reverse=reverse*10+reminder;// 0*10+4=4
             a=a/10;//1234/10=123.4~123
        }
        System.out.println("Reverse number:"+reverse);
    }
}
