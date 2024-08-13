class main
{
    private String name;
    main()
    {
        System.out.println("Cnstructor is called");
        name="sujal";
    }
    static public  void main(String...args)
    {
        main x=new main();
        System.out.println("Name is:"+x.name);
    }
}