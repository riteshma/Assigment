class Test 
{
    void show(int a)
    {
        System.out.println("1");
    }
    void show(String a)
    {
        System.out.println("2");
    }
    public static void main(String[] args) 
    {
        Test t = new Test();
        t.show(10);
        t.show("Rahul");
    }
}
