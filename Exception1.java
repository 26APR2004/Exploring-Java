// 	Exception handling
import java.util.*;
class Exception
{
   
  public static void main(String...sujal)
 {
   System.out.println("Start"); 
    int result,divident,divisor;
   Scanner sc=new Scanner(System.in);
   for(int i=1;i<=5;i++){
      System.out.println(+i);  
   System.out.println("Enter the divident:");
     divident=sc.nextInt();
   System.out.println("Enter the diviosr:");
    divisor=sc.nextInt();
    try
    {
      result=divident/divisor;
       System.out.println("result :"+result);
     } 

catch(Exception e)
{  
   System.out.println("Eception is occure!");

}
}
System.out.println("End");}}