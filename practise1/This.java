class This 
{
    int i;
    void setValues(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}
class Rahul
{
    public static void main(String[] args) 
    {
       This t = new This();
       t.setValues(10); 
       t.show();
    }
}
