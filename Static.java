
import javax.swing.border.EmptyBorder;

class emp{
    static String cname ="TCS";
    String name; 
    int salary;
    void get(String s1, int s2)
    {
        name = s1;
        salary = s2;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(cname);
    }   
     static int add(int a, int b)
     {
         return a+b;
     }
    public static void main(String...s)
    {
        emp e1 = new emp();

        e1.get("lalu",101);
        e1.show();
        System.out.println(cname);
        System.out.println(emp.cname);

        //  int z = emp.add(10,20);
         System.out.println(add(10, 20));
        //  z=add(10,200);
        System.out.println(add(10, 200));
    }
  
}