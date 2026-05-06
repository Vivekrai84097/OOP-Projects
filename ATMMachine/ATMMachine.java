package ATMMachine;

class ATM{
    private int balance;
    private int PIN;

    ATM(int balance, int PIN){
        if(balance > 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }

        if(PIN >= 1000 && PIN <= 9999){
            this.PIN = PIN;
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void verifyPin(int enteredPin){
        if(enteredPin == PIN){
            System.out.println("PIN verified successfully");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void withdrawMoney(int amount, int enteredPin){
        if(amount > 0 && amount <= balance && enteredPin == PIN){
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
        } else {
            System.out.println("Insufficient Balance or incorrect PIN");
        }
    }

    public void checkBalance(int enteredPin){
        if(enteredPin == PIN){
            System.out.println("Available Balance : " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM a = new ATM(10000, 1111);
        a.verifyPin(1111);
        a.withdrawMoney(2400, 1212);
        a.checkBalance(1111);
    }
}