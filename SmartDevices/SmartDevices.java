package SmartDevices;

interface Switchable{
    public void turnOn();
    public void turnOff();
}

class Fan implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("Fan ON");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan OFF");
        System.out.println();
    }
}

class Light implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("Light ON");
    }

    @Override
    public void turnOff(){
        System.out.println("Light OFF");
        System.out.println();
    }
}

class AC implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("AC ON");
    }

    @Override
    public void turnOff(){
        System.out.println("AC OFF");
    }
}

public class SmartDevices {
    
    public static void main(String[] args) {
        Switchable s1 = new Fan();
        Switchable s2 = new Light();
        Switchable s3 = new AC();

        s1.turnOn();
        s1.turnOff();

        s2.turnOn();
        s2.turnOff();

        s3.turnOn();
        s3.turnOff();
    }
}