class Use5 
{
    Use5(Demo t)
    {
        System.out.println("test class constructor");
    }
}
class Demo
{
    void m1()
    {
        Use5 t = new Use5(this);
    }
    public static void main(String[] args) 
    {
        Demo t = new Demo();
        t.m1();
    }
}
