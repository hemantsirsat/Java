import java.util.*;

public class ForLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        //for loop for numbers from 1 to num
        for(int i = 1;i<=num;i++){
            System.out.print(i+"\t");
        }
        System.out.print("\n");
        
        //for loop for sum of numbers [1,num]
        int count = 0;
        for(int i = 1;i<=num;i++){
            count = count + i;
        }
        System.out.println("Sum of Numbers: "+count);
        
        int even=0,odd=0,i=0;
        while(i!=num){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
            i++;
        }
        System.out.println("|Even|: "+even+"\n|Odd|: "+odd);
        //reverse loops
        do{
            System.out.print(num+"\t");
            num--;
        }while(num!=0);
    }
}
