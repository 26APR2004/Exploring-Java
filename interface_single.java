/*
Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display()” that prints the name, age, and salary of the employee.
Create an object of the “Person” class and call the “display()” method.
Create an object of the `Employee` class and call the “display()” method.*/
class person
  {
    String name;
    int age;
    person(String name,int age)
    {
      this.name=name;
      this.age=age;
    }
    void display()
    {
      System.out.println("Namne:"+name);
      System.out.println("Age:"+age);
    }
  }
class Employee extends person
  {
    double salary;
    Employee(String name,int age,double salary)
    {
      super(name,age);
      this.salary=salary;
    }
  
    void display()
    {
      super.display();
      System.out.println("Salary:"+salary);
      
      
    }
  }
class interface_single
  {
    public static void main(String args[])
    {
      person p1=new person("Sujal",20);
      Employee e1=new Employee("Sujal",20,20000);
      e1.display();
      
    }
  }
