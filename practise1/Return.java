class Return 
{
    Object show()
    {
        System.out.println("1");
        return null;
    }
}
class XYZ extends Return
{
    String show()
    {
        System.out.println("2");
        return null;
    }
    public static void main(String[] args) 
    {
        Return t = new Return();
        t.show();
        XYZ d = new XYZ();
        d.show(); 
    }
}
