//Method overloading example
import java.util.*;

class Method_Overloading
{
    public static void main(String[] args)
    {
        Addition a = new Addition();
        
        int n1 = a.add(5,10);
        int n2 = a.add(5,10,15);
        int n3 = a.add(5,10,15,20);
        
        System.out.println("Add Method With 2 Variables = " + n1);
        System.out.println("Add Method With 3 Variables = " + n2);
        System.out.println("Add Method With 4 Variables = " + n3);
        
        
    }
}

class Addition
{ 
    int add(int a,int b)
    {
       return a+b; 
    }
    int add(int a, int b,int c)
    {
        return a+b+c;
    }
    int add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
}
