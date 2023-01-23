class D 
{
    void showD()
    {
        System.out.println("Parent class");
    }
}
class C extends D
{
    void showC()
    {
       System.out.println("Child clas");
    }
    public static void main(String[] args) 
    {
      D ob1 = new D();
      ob1.showD();
      System.out.println("---------------");
      C ob2 = new C();
      ob2.showD();
      ob2.showC();

    }
}
