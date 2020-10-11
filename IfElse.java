import java.util.*;

public class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println(num + " is Divisible by 2");
        }
        else{
            System.out.println(num + " is not Divisible by 2");
        }
    }
}
