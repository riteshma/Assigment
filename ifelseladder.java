

public class ifelseladder {
    public static void main(String[] args) {
         
        int marks;
       
        System.out.println("Enter marks");
        int sc = new java.util.Scanner(System.in).nextInt();
        if(sc>80){
            System.out.println("First class");
        }else if(sc<80 && sc>=70){
            System.out.println("Second Class");
        }else if(sc<70 && sc>=50){ 
            System.out.println("Third class");
        }else{
            System.out.println("Fourth class");
        }
        
        
    }
    
}
