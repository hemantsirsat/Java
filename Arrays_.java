import java.util.*;

public class Arrays_ 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
    
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
            
        System.out.println("Array: ");
        for(int i=0;i<n;i++)
            System.out.println("a["+i+"] = "+ a[i]);
    }
}
