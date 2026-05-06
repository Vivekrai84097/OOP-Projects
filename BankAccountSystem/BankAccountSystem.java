package BankAccountSystem;

class Bank{
    private int balance;

    Bank(int balance){
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
            this.balance = 0;
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount){
        if(amount > 0 && (balance - amount) >= 500){
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
        } else {
            System.out.println("Insufficient Balance or minimum balance rule violated");
        }
    }

    public void checkBalance(){
        System.out.println("Total Balance : " + balance);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {
        Bank b1 = new Bank(10000);
        b1.deposit(2300);
        b1.withdraw(12000);
        b1.checkBalance();
    }
}