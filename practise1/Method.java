class Method 
{
  String color;
  int age;
  void initObj(String c, int a)
  {
    color = c;
    age = a;
  }  
  void display()
  {
    System.out.println(color + " " + age);
  }
  public static void main(String[] args) 
  {
    Method buzo = new Method();
    buzo.initObj("black", 10);
    buzo.display();
  }
}
