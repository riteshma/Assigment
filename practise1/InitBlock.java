class InitBlock 
{
    int x;
    {                                     //Init Block
        this.x=10;
        System.out.println("Init Block");
    }
    InitBlock()
    {
        System.out.println("default");
        System.out.println(x);
    }
    {                                     //Init Block
        this.x=10;
        System.out.println("Init Block 2");
    }
    InitBlock(int y)
    {
        System.out.println(x+y);
    }
    public static void main(String[] args) 
    {
        new InitBlock();
        new InitBlock(10);
    }
    
}
