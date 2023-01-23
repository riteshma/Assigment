class Use4 
{
   void m1(Use4 t)
   {
    System.out.println("I am m1 method");
   } 
   void m2()
   {
    m1(this);
   }
   public static void main(String[] args) {
    Use4 t = new Use4();
    t.m2();
   }
}
