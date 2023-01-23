class AccessModifier 
{
    protected void show()
    {
        System.out.println("1");
    }
}
class XYZ extends AccessModifier
{
    public void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) 
    {
        AccessModifier t = new AccessModifier();
        t.show();
        XYZ ob = new XYZ();
        ob.show();

    }
}
