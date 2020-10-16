import java.util.*;

public class BinarySearch
{
    static int binarysearch(int a[], int lb, int ub, int ele)
    { 
        while(lb <= ub)
        {
            int m = (lb + ub)/2;
            System.out.println(a[m]);
            
            if(a[m]<ele)
                lb = m + 1;
            else if(a[m] > ele) 
                ub = m-1;
            else
                return 1;
        }
        return -1;
    
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter No. of Elements = ");
        n = sc.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter Elements(Sorted): ");
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter Element to be searched: ");
        int ele = sc.nextInt();
        
        int result = binarysearch(a,0,n-1,ele);
        if(result == 1)
            System.out.println("Element Found");
        else System.out.println("Element not Found");
       
    }
}
