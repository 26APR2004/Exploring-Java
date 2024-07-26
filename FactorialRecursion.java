import java.util.*; 
class FactorialRecursion
{
    
    static int fact(int n)
    {
        if(n==1)
        return 1;
        
        else{
        return n*fact(n-1);
        }
       
        
    }
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factorial number:");
        int a=sc.nextInt();
       int result=fact(a);
       System.out.println("factor is:"+result);
    }
}