import java.util.*;

class Inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount = ");
        int n = sc.nextInt();
        
        Check c = new Check();  //object of class c
        Add a = new Add();      //object of class a
        
        a.AddAmount(n);
        c.CheckBalance();
        a.CheckBalance();
        
        //a.AddAmount has access to variable `Balance` of its own class which it inherited from class `Check`.
        
        //Changing value of `Balance` in one of the class will not affect the value of same variable in other class.
    }
}

class Check
{
    int Balance;
    Check()                        //constructor
    {
        Balance = 1000;
    }
    void CheckBalance()
    {
        System.out.println("Previous Balance = "+Balance);
    }
}

class Add extends Check        //example of Inheritance; class Add has all the variables and methods of class Check
{   
    int PreviousDeposit;
    void AddAmount(int amt)
    {
        PreviousDeposit = amt;
        Balance = Balance + amt;
    }
        
    void CheckBalance()         //method overriding; same method exists in parent class, here i've changed the working internally.
    {
        System.out.println("Last Deposit Amount = " + PreviousDeposit);
        System.out.println("Total Available Balance = " + Balance);
    }
}
