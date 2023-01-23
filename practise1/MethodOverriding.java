class MethodOverriding
{
    void show()
    {
        System.out.println("1");
    }
} 
class XYZ extends MethodOverriding
{
    void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) 
    {
        MethodOverriding t = new MethodOverriding();
        t.show();
        XYZ d = new XYZ();
        d.show();
    }
}

   
