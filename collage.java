class student
{
    int roll_no;
    String name;
    static String college_name="DKTE";

    student(int r_number,String sname)
    {
       this.roll_no=r_number;
       this.name=sname;
    }
}
    void display()
    {
        System.out.println(" "+roll_no+" "+name+" "+college_name);
    }

 public class collage
{
    static public void main(String[]args)
    {
        student s1=new student(12,"sujal");
        s1.display();

    }

}
