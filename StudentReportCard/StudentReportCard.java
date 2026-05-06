package StudentReportCard;

class Student{
    private String name;
    private int rollNo;
    private int marks;

    Student(String name, int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Default set to 0");
        }
    }

    public String gradeCalculation(){
        if(marks >= 90){
            return "A";
        } else if (marks >= 75){
            return "B";
        } else if (marks >= 60){
            return "C";
        } else if (marks >= 40){
            return "D";
        } else {
            return "Fail";
        }
    }

    public void displayReportCard(){
        System.out.println("----Report Card----");
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + gradeCalculation());
    }
}

public class StudentReportCard {
    
    public static void main(String[] args) {
        Student s1 = new Student("Vivek", 562, 76);
        s1.displayReportCard();
    }
}