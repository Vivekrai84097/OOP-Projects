package SchoolSystem;

class Person{
    public void displayRole(){}
}

class Student extends Person{

    @Override
    public void displayRole(){
        System.out.println("Role : Student");
    }
}

class Teacher extends Person{

    @Override
    public void displayRole(){
        System.out.println("Role : Teacher");
    }
}

public class SchoolSystem {
    
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.displayRole();
        p2.displayRole();
    }
}
