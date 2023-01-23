class ExceptionHandling 
{
    void show() throws RuntimeException
    {
        System.out.println("2");
    }
}
class ABC extends ExceptionHandling
{
    void show() throws ArithmeticException
    {
        System.out.println("3");
    }
    public static void main(String[] args) 
    {
        ExceptionHandling t = new ExceptionHandling();
        t.show();

        ABC ob = new ABC();
        ob.show();
    }
}
