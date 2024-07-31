import java.util.Scanner;

class rectangleArea
{
    int length;
    int width;
    void areaCalculation(int l,int w)
    {
        length=l;
        width=w;
    }
    void display()
    {
        System.out.println("Area of rectangle is:"+length*width);
    }
}

public class reactangle
{
    
   public static void main(String...args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length:");
    int l=sc.nextInt();
    System.out.println("Enter the width:");
    int w=sc.nextInt();
      rectangleArea r=new rectangleArea();
      r.areaCalculation(l,w);
      r.display();
}
}
