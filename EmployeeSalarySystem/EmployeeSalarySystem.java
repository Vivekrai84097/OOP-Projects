package EmployeeSalarySystem;

abstract class Employee{
    abstract void calculateSalary();
}

class FullTime extends Employee{

    @Override
    public void calculateSalary(){
        System.out.println("Full Time Salary : 40000");
    }
}

class PartTime extends Employee{
    int days;
    int ratePerHour;
    int hours;

    PartTime(int days,int ratePerHour,int hours){
        if(days > 0){
            this.days = days;
        } else {
            this.days = 0;
            System.out.println("Invalid days");
        }

        if(ratePerHour > 0){
            this.ratePerHour = ratePerHour;
        } else {
            this.ratePerHour = 0;
            System.out.println("Invalid rate per hours");
        }

        if(hours > 0){
            this.hours = hours;
        } else {
            this.hours = 0;
            System.out.println("Invalid hours");
        }
    }

    @Override
    public void calculateSalary(){
        int salary = days*ratePerHour*hours;
        System.out.println("Part Time Salary : " + salary);
    }
}

public class EmployeeSalarySystem {
    
    public static void main(String[] args) {
        Employee e1 = new FullTime();
        Employee e2 = new PartTime(20, 100, 8);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}