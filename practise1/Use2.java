class Use2 
{
    void display()
    {
        System.out.println("hello");
    }
    void show()
    {
        display();
    }
    public static void main(String[] args) 
    {
        Use2 t = new Use2();
        t.show();
    }
}
