class Overload 
{
    public static void main(String[] args) 
    {
        System.out.println("1");
        Overload t = new Overload();
        t.main(20);
    }
    public static void main(int a) 
    {
      System.out.println("2");  

    }
}
