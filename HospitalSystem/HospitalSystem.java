package HospitalSystem;

abstract class Patient{
    abstract void treatmentDetails();
}

class IndoorPatient extends Patient{

    @Override
    public void treatmentDetails(){
        System.out.println("Indoor Patient : Admitted, Room + Treatment included");
    }
}

class OutdoorPatient extends Patient{

    @Override
    public void treatmentDetails(){
        System.out.println("Outdoor Patient : OPD Consultation only");
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new IndoorPatient();
        Patient p2 = new OutdoorPatient();

        p1.treatmentDetails();
        p2.treatmentDetails();
    }
}