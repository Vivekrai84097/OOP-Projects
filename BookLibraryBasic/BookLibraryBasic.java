package BookLibraryBasic;

class Library{
    String title;
    String author;
    boolean issueStatus;

    Library(String title, String author, boolean issueStatus){
        this.title = title;
        this.author = author;
        this.issueStatus = issueStatus;
    }

    public void issueBook(){
        if(issueStatus == true){
            System.out.println("Book is already issued");
        } else {
            issueStatus = true;
            System.out.println("Book issued sucessfully");
        }
    }

    public void returnBook(){
        if(issueStatus == true){
            issueStatus = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book was not issued");
        }
    }

    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Book Issue Status : " + issueStatus);
    }
}

public class BookLibraryBasic {

    public static void main(String[] args) {
        Library l = new Library("Wings of fire", "A.P.J Abdul Kalam", true);

        l.issueBook();
        l.returnBook();
        l.displayInfo();
    }
}