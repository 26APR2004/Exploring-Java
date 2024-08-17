import java.lang.*;
class calculator
{
   double x;
   double y;
   calculator(double x)  //constructor
   {
     this.x=x;
     this.y=Math.sqrt(x);
   }

}

class Example
{
    public static void main(String[]sujal){

        calculator a=new calculator(20);
        
        System.out.println("Square root of "+a.x+"is"+a.y);
    }
}