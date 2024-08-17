//Recursion program
public class RecursionExample
{
    static int count=0;  // static variable(class varible)
    static void p()  // static method
    {
        count++;  // 1,2,3,4,5
        if(count<=5)
        {System.out.println("Hello"+count);
        p();  //recall until condition is satisfy
        }
    }
    public static void main(String...sujal)
    {
        p(); //recall
    }
}