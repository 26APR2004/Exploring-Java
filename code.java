class program
{
    String program;
    // constructor with on parametr
    public program(String lag)  //public accessifer allow the constructor to call outside of class
    {
        this.program = lag;
        System.out.println("Program name is: "+program);
    }
}

class code
{
    public static void main(String[]args)
    {
        program p1=new program("java");
        program p2=new program("python");
        program p3=new program("c++");
    }
    
}