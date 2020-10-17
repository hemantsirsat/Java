import java.util.*;

class Banking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int Id = sc.nextInt();
        
        Bank b = new Bank(name,Id);
        b.menu();
        
    }
}

class Bank
{   
    int Balance;
    int PreviousDeposit;
    
    Bank(String name,int Id)
    {
        System.out.println("\nWelcome, " + name + "\nID: "+Id);
    }
    
    void Deposit(int Deposit)
    {
        Balance = Balance + Deposit;
        PreviousDeposit = Deposit;
        System.out.println("Amount Deposited Successfully");
    }
    
    void Withdraw(int Amount)
    {
        if(Balance < Amount)
        {
            System.out.print("\nInsufficient Balance");
            System.out.print("\nAvailable Balance = " + Balance);
        }
        else
        {
            Balance = Balance - Amount;
            System.out.print("\nAmount Withdrawn = " + Amount);
        }
    }
    
    void CheckBalance()
    {
        System.out.print("\nCurrent Balance = " + Balance);
    }
    
    void menu()
    {
        Scanner sc = new Scanner(System.in);
        int amt, choice;
        
        
        do{
            System.out.println("\n<---------------------------------------->");
            System.out.println("Which Operation Would You Like to Perform\n");
            System.out.println("1. Deposit Money\t2. Withdraw Money\t3. Check Balance\t4. Exit");
            
            choice = sc.nextInt();
        
            switch(choice)
            {
                case 1: System.out.print("Enter Amount: ");
                        amt = sc.nextInt();
                        Deposit(amt);
                        break;
                
                case 2: System.out.print("Enter Amount to Withdraw: ");
                        amt = sc.nextInt();
                        Withdraw(amt);
                        break;
                        
                case 3: CheckBalance();
                        break;
                        
                case 4: break;
                
                default: System.out.println("Invalid Choice\n");
                         break;
            }
        }while(choice!=4);
    }
}
