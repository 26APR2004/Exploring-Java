class and_operator
{
    static public void main(String[]args)
    {
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++>b);//false&&true=false
        System.out.println(a);
        System.out.println(a<b&a++>b);//false&true=false
        System.out.println(a);

    }
}