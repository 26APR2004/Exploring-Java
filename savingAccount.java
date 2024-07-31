import java.util.*;
class savingAccount
{
    static int intrest;  //Static variable
    double savingBalance;
    void savingAccount(double Balance)//Constructor
    {
        savingBalance=Balance;
    }
    void calculation()                  
    {
System.out.printf("Your current balance:%,.2f\n",savingBalance);
double calculatebalance;
calculatebalance=(savingBalance*intrest/12)/100;//monthlyIntrest
savingBalance+=calculatebalance;
System.out.printf("new balance:%,.3f\n",(float)savingBalance);
    }
    static void modifiedintrest(int newintrest)//Static function
    {
      intrest=newintrest;
    }
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first the balance:");
        double a=sc.nextDouble();
        System.out.println("Enter second the balance:");
        double b=sc.nextDouble();
        savingAccount s1=new savingAccount();
        savingAccount s2=new savingAccount();
        s1.savingBalance=a;
        s1.intrest=4;
        s1.calculation();
       s1. modifiedintrest(5);
       s1.calculation();
       
       s2.savingBalance=b;
        s2.intrest=4;
        s2.calculation();
       s2. modifiedintrest(5);
       s2.calculation();
    }
}