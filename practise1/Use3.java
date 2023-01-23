class Use3 
{
    Use3()
    {
        System.out.println("no any constructor");
    }
    Use3(int a)
    {   
        this();
        System.out.println("parametrized constructor");
    }
    public static void main(String[] args) 
    {
       Use3 t = new Use3(10); 
    }
}
