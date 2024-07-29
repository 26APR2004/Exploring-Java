import java.util.*;

class Student
{
    
    int prn=72;
    String name="sujal vijay mane";
    long fee_paid=1200445504;

    static public void main(String...args)
    {
       Student s1=new Student();
       System.out.println("PRN number of student:"+s1.prn);
       System.out.println("Name of student:"+s1.name);
       System.out.println("Student paid fee:$"+s1.fee_paid);
    }

}
