class Employee
{
    String name;
    int id;
    double salary;
    void insert(String n_1,int id_1,double salary_1)
    {
        name=n_1;
        id=id_1;
        salary=salary_1;
    }
    void display()
    {
        System.out.println(name+" "+id+" $"+salary);
    }
}

public class employeeT1
{
    static public void main(String...args)
    {
        Employee e1=new Employee();

        e1.insert("sujal",12345,120000);
        e1.display();
}
}
