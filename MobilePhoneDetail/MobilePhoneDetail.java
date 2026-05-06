package MobilePhoneDetail;

class Mobile{
    String brand;
    String model;
    int batteryPercentage;

    Mobile(String brand, String model, int batteryPercentage){
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
    }

    public void chargeBattery(){
        System.out.println("Charging Battery...");

        batteryPercentage += 30;

        if(batteryPercentage > 100){
            batteryPercentage = 100;
        }

        System.out.println("Battery is now " + batteryPercentage + "%");
    }

    public void usePhone(){
        System.out.println("Using Phone...");

        batteryPercentage -= 10;

        if(batteryPercentage < 0){
            batteryPercentage = 0;
        }

        System.out.println("Battery decreased to " + batteryPercentage + "%");

        if(batteryPercentage <= 20){
            System.out.println("Low battery warning!");
        }
    }

    public void displayInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Battery : " + batteryPercentage + "%");
    }
}

public class MobilePhoneDetail {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "S25", 60);
        m1.chargeBattery();
        m1.usePhone();
        m1.displayInfo();
    }
}