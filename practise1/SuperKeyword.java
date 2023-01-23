class SuperKeyword 
{
    void show()
    {
        System.out.println("4");
    }
}
class FGH extends SuperKeyword
{
    void show()
    {
        super.show();
        System.out.println("5");
    }
    public static void main(String[] args) 
    {
        FGH ob = new FGH();
        ob.show();
    }
}
