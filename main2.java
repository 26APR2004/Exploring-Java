import java.time.LocalDate;  // this is used take current date
import java.time.Period;  // this is used to find time period between years,date,month and so on.
import java.time.format.DateTimeFormatter; // This is used take date in dd/mm/yyyy formate

class Person
{
    public String name;
    // public String BirthDate;
    public  double height;
    public double weight;
    public String address;
    public LocalDate birthDate;
    //Constructor
    public Person(String name,double height,double weight,String address,String birthDate)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.address=address;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.birthDate=LocalDate.parse(birthDate,formatter);
    }


    public int calculateAge()
        {
            LocalDate currentDate=LocalDate.now();
            return Period.between(birthDate,currentDate).getYears();

        }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Height:"+height+"m");
        System.out.println("Weight:"+weight+"kg");
        System.out.println("Address:"+address);
        System.out.println("Age : "+calculateAge()+" years");
    }
}

class Student extends Person{
   public int roll_no;
   public  int marks;
   int no_subjects;  //extra
    //Constructor
    public Student(int roll_no,int marks,int no_subjects,String name,double height,double weight,String address,String birthDate)
    {
        super(name, height, weight, address, birthDate);
        this.roll_no=roll_no;
        this.marks=marks;
        this.no_subjects=no_subjects;
    }
    public int calculateAvg()
    {
       int Avg=marks/no_subjects;
       return Avg;
    }


    public void display()
    {
        super.display();
        System.out.println("Roll number of student:"+roll_no);
        System.out.println("Marks of student:"+marks);
        System.out.println("AvgMarks of student:"+calculateAvg());

    }
}

class Employee extends Person
{
    public int empID;
    public double salary;
    //constructor
    public Employee(int empID,double salary,String name,double height,double weight,String address,String birthDate)
    {
       super(name,height,weight,address, birthDate);
       this.empID=empID;
       this.salary=salary;
    }
    public double calculateTax() {
        double tax = 0;
        double income = this.salary;  // Assign the income salary to current salry

        // Define tax brackets and rates
        double taxRate1 = 0.10; // 10% for income up to $30,000
        double taxRate2 = 0.20; // 20% for income between $30,001 and $60,000
        double taxRate3 = 0.30; // 30% for income above $60,000
        
        if (income <= 30000) {
            tax = income * taxRate1;
        } else if (income <= 60000) {
            tax = (30000 * taxRate1) + ((income - 30000) * taxRate2);
        } else {
            tax = (30000 * taxRate1) + (30000 * taxRate2) + ((income - 60000) * taxRate3);
        }

        return tax;
    }

    public void display()
    {
        super.display();
        System.out.println("Emplyee ID is:"+empID);
        System.out.printf("Emplyee salary is:$%,.2f\n",salary);
        System.out.println("Emplyee tax is:"+calculateTax());
    }
}

class Main{
    public static void main(String...inheritance)
    {
        Person p1= new Person("Sujal Mane",63,72,"100 futi road,Sangli","26-04-2004");
        p1.display();
        System.out.println();
        Student s1=new Student(87,67,3,"Akash Patil",67,100,"Near to mhasata corner,Ichalkarnji","25-04-2004");
        s1.display();
        System.out.println();
        Employee e1=new Employee(124,2000,"Parth Patil",62,71,"Near to sarkar bank ,Ichalkarnji","22-04-2004");
        e1.display();
        System.out.println();
        
    }
}