package EmployeeRecord;

class Employee{
    private int salary;

    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
        if(s >= 10000){
            salary = s;
        } else {
            System.out.println("Invalid salary");
        }
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setSalary(17000);
        System.out.println("Salary of Employee : " + e1.getSalary());
    }
}