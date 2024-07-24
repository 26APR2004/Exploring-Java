
class Anonmyous_array
{
    static void printarr(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);
    }

static public void main(String...args)
{
    printarr(new int[]{12,11,23,45}); //Anonmyous array
}
}