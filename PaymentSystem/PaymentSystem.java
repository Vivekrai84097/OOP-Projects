package PaymentSystem;

class Payment{
    public void makePayment(){}
}

class UPI extends Payment{

    @Override
    public void makePayment(){
        System.out.println("Make payment using PhonePe, GPay, Paytm");
    }
}

class Card extends Payment{

    @Override
    public void makePayment(){
        System.out.println("Make payment using Credit Card/Debit Card");
    }
}

class Cash extends Payment{

    @Override
    public void makePayment(){
        System.out.println("Make payment using Cash");
    }
}

public class PaymentSystem {
    
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        Payment p3 = new Cash();

        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}