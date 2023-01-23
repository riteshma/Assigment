class AConstructor 
{
    int x;
    int y;
    AConstructor(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) 
    {
        AConstructor a1 = new AConstructor(10, 20);
        a1.show();
        AConstructor a2 = new AConstructor(100, 200);
        a2.show();

    }
}
