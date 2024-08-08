//interface program
import java.util.*;
interface client
{
    void input(); // abstract method
    void output(); //abstract method
}
class emplyoee implements client
{
    String name;
    double salary;
    public void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    name=sc.nextLine();
    System.out.println("Enter your salary:");
    salary=sc.nextDouble();
    }

    public void output()
    {
        System.out.println("Employee name is:"+name);
        System.out.printf("Employee salary is:%,.3f",salary);
    }

    static public void main(String...args)
    {
        client c=new emplyoee();
        c.input();
        c.output();
    }

}