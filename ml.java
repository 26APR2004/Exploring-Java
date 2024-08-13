interface structureML //interface
{
    void ml(String name);
}

//interface implementation
class AI implements structureML
{
    public void ml(String name)
    {
        System.out.println("Hello, " + name);
    }
}

class ML1{
    public static void main(String[] args) {
        AI ai = new AI();
        ai.ml("John");
    }
}