/*Java program to perform arithmatic operation*/
import java.util.*;
class GetMatrix_2D
{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int add[][]=new int[2][2];
    int sub[][]=new int[2][2];
    int mul[][]=new int[2][2];
    public void input()
    {
    System.out.println("Enter the first matrix:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
         a[i][j]=sc.nextInt();
     }
    }
    System.out.println("Enter the second matrix:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        b[i][j]=sc.nextInt();

     }
    }}

public void display()
{
    System.out.println(" first matrix:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        System.out.print(a[i][j]+" ");
     }
     System.out.println();
    }
    System.out.println(" second matrix:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        System.out.print(b[i][j]+" ");
     }
     System.out.println();
    }}

    public void addition()
    {
       
        for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        add[i][j]=a[i][j]+b[i][j];
     }
    }
    System.out.println("Addition of a and b matrix is:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        System.out.print(add[i][j]+" ");
     }
     System.out.println();
    }
    
    }
    
    public void subtraction()
    {
       
        for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        sub[i][j]=a[i][j]-b[i][j];
     }
    }
    System.out.println("Subtraction of a and b matrix is:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        System.out.print(sub[i][j]+" ");
     }
     System.out.println();
    }
    
    }

    public void multiplication()
    {
       
        for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        mul[i][j]=a[i][j]*b[i][j];
     }
    }
    System.out.println("multiplication of a and b matrix is:");
    for(int i=0;i<2;i++)
    { 
        for(int j=0;j<2;j++)
     {
        System.out.print(mul[i][j]+" ");
     }
     System.out.println();
    }
    
    }

    
    public static void main (String[] args)
        {
            GetMatrix_2D m= new GetMatrix_2D();
            m.input();
            m.display();
            m.addition();
            m.subtraction();
            m.multiplication();
        }
    

}

