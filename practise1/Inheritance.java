class Father 
{
    void eat()
    {
        System.out.println("I am eating");
    }
}
class Son extends Father
{
    public static void main(String[] args) 
    {
        Son d = new Son();
        d.eat();
    }
}
