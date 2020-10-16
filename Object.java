import java.util.*;

public class Object
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Two Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        Bank b = new Bank(name);        //object b of class Bank
        
        b.add(n1,n2);                   //Call method add
    }
}

class Bank
{
    Bank(String name)                       //Constructor
    {
        System.out.println("Hello, "+name);
    }

    void add(int a, int b)                  //method add of class Bank
    {
        System.out.println("Addition = "+(a + b));
    }
}
