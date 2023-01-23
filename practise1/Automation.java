class Automation 
{
   void show(int a)
   {
    System.out.println("int method");
   } 
   void show(String a)
   {
    System.out.println("String method");
   }
   public static void main(String[] args) 
   {
    Automation t = new Automation();
    t.show('a');
   }
}
