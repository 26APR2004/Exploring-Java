class code1
{
    String program;
    // constructor with on parametr
    private code1(String lag)  //private constructor access only inside  the class
    {
        this.program = lag;
        System.out.println("Program name is: "+program);
    }




    public static void main(String[]args)
    {
        code1 p1=new code1("java");
        code1 p2=new code1("python");
        code1 p3=new code1("c++");
    }
    
}