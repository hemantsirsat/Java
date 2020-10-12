import java.util.*;

public class Methods_Functions {
    
    public static void Addition(int a, int b){      //method of class Methods_Functions
        int result = a + b;
        System.out.println("Addition = " + result);
    }
    
    public int Subtract(int a, int b) {
        return a - b;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();
        
        Addition(num1, num2);
        
        Methods_Functions sub = new Methods_Functions();    //object of class Methods_Functions
        int result = sub.Subtract(num1, num2);              //method Subtract
        System.out.println("Subtraction = " + result);
    
    }
}
