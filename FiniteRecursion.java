class FiniteRecursion
{
    static int count=0;
    static void hello()
    {
        count++;
        if(count<=5){
        System.out.println("Hello");
        hello();}
       
        
    }
    static public void main(String...args)
    {
        hello();
    }
}
