interface I1
{
    void display1();
}
abstract class AbstractMethod 
{
   abstract void display();
   void show() throws RuntimeException
   {
    System.out.println("1");
   } 
}
class DEF implements I1
{   

    public void display1()
    {

    }
    
    void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) 
    {
       // AbstractMethod t = new AbstractMethod();
       // t.show();
        
        DEF d = new DEF();
        d.show();

    }
}
