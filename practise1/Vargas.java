class Vargas 
{
    void show(int a)
    {
        System.out.println("int method");
    }
    void show(int...a) //Varagas method
    {
       System.out.println("vargars method");
    }
    public static void main(String[] args) 
    {
        Vargas t = new Vargas();
        t.show(1);
        t.show(1,2,3);
    }
}
