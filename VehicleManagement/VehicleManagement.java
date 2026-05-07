package VehicleManagement;

class Vehicle{
    public void start(){}
    public void stop(){}
    public void fuelType(){}
}

class Car extends Vehicle{

    @Override
    public void start(){
        System.out.println("Car starts");
    }

    @Override
    public void stop(){
        System.out.println("Car stops");
    }

    @Override
    public void fuelType(){
        System.out.println("Car fuel type : Diesel");
        System.out.println();
    }
}

class Bike extends Vehicle{

    @Override
    public void start(){
        System.out.println("Bike starts");
    }

    @Override
    public void stop(){
        System.out.println("Bike stops");
    }

    @Override
    public void fuelType(){
        System.out.println("Bike fuel type : Petrol");
    }
    
}

public class VehicleManagement {
    
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
        v2.fuelType();
    }
}