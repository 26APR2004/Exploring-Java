package util;

class Info
{
   public String name;
   public int age;
   public int roll_no;
   public void display()
   {
	   System.out.println("name of Student:"+name);
	   System.out.println("age of Student:"+age);
	   System.out.println("roll_no of Student:"+roll_no);
   }
}
public class Student_profile {
	public static void main(String...args) {
	Info s1=new Info();
	s1.name="sujal";
	s1.age=20;
	s1.roll_no=32;
	s1.display();}
    
}
