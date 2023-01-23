public class Constructor 
{

    // 1. Default Constructor

    // int i;
    // String s;
    // public static void main(String[] args) {
    //     Constructor t = new Constructor();
    //     System.out.println(t.i+ " " + t.s);
    // }

    //2. No-arg Constructor
     
    // Constructor()
    // {
    //    System.out.println("No arg constructor"); 
    // }
    // public static void main(String[] args) 
    // {
    //    Constructor t = new Constructor(); 
    // }

    //3. Parametrized Constructor

    // Constructor(int a)
    // {
    //     System.out.println("Parametrized Constructor");
    // }
    // public static void main(String[] args) 
    // {
    //     Constructor t = new Constructor(1);
    // }


    
  String name;
  int emp_id;
  
  Constructor(String name, int emp_id)
  {
    this.name = name;
    this.emp_id = emp_id;
  }

  public static void main(String[] args) 
  {
    Constructor e1 = new Constructor("Deepak", 101);
    Constructor e2 = new Constructor("Rahul", 201);
    System.out.println("Employee 1:"+ e1.name+ " " +e1.emp_id);
    System.out.println("Employee 2:"+ e2.name+ " " +e2.emp_id);

  }
}
