import java.util.*;

public class InputOutput {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1*num2;
        int num6 = num1/num2;
        
        System.out.println("Hello, "+name);
        System.out.println("Addition = "+num3);
        System.out.println("Subtraction = "+num4);
        System.out.println("Multiplication = "+num5);
        System.out.println("Division = "+num6);
    }
}
