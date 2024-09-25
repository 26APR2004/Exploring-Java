// Multiple Thread  
 
class A extends Thread
{
   public void run()
{
   for(int i=1;i<=5;i++)
{
   System.out.println("Thread of A..."+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e){
  System.out.println(e);
}
}}}


class B extends Thread
{
   public void run()
{
   for(int i=1;i<=5;i++)
{
   System.out.println("Thread of B..."+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
  System.out.println(e);
}
}}}

 class Mythread1 
{
  public static void main(String...args)
{
A a=new A();
B b=new B();
a.start();
b.start();
}
}

