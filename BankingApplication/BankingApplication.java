package BankingApplication;

class BankAccount{
    long accountNumber;
    String accountHolderName;
    int balance;

    BankAccount(long accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if(balance > 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Amount : " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
        } else {
            System.out.println("Insufficient balance or Invalid amount");
        }
    }

    public void displayAccountDetails(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Total Balance : " + balance);
    }
}

class SavingAccount extends BankAccount{
    int interestRate;

    SavingAccount(long accountNumber, String accountHolderName,int balance, int interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += (balance * interestRate) / 100;
        System.out.println("Interest added successfully");
        System.out.println("Balance including interest in saving account: " + balance);
    }
}

class CurrentAccount extends BankAccount{

    int interestRate;
    
    CurrentAccount(long accountNumber, String accountHolderName, int balance, int interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();

        System.out.println("Account Type : Current Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

public class BankingApplication {
    
    public static void main(String[] args) {
        BankAccount b = new BankAccount(121224321l, "Vivek", 10000);
        b.deposit(2500);
        b.withdraw(1200);
        b.displayAccountDetails();
        System.out.println("-------------------");

        SavingAccount s = new SavingAccount(3423456789l, "Varun", 15000, 7);
        s.deposit(4300);
        s.withdraw(1200);
        s.addInterest();
        System.out.println("-------------------");

        CurrentAccount c = new CurrentAccount(9878656798l, "O P Rai", 100000, 5);

        c.deposit(10000);
        c.withdraw(5000);
        c.displayAccountDetails();
    }
}