package LibraryManagementSystem;

class Book {
    private int bookId;
    private String title;
    private String author;
    boolean isIssued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued sucessfully");
        } else {
            System.out.println(title + " already issued");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " returned successfully");
        } else {
            System.out.println(title + " was not issued");
        }
    }

    public void displayBook() {
        System.out.println(bookId + " - " + title + " by " + author);
    }
}

class User {
    private int userId;
    private String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void displayUser() {
        System.out.println("User : " + userId + " - " + name);
    }
}

class Library {

    Book[] books = new Book[5];
    int count = 0;

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully");
        } else {
            System.out.println("Library is full");
        }
    }

    public void showBook() {
        System.out.println("Available Books : ");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }

    public void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                books[i].issueBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void searchBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                books[i].displayBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void removeBookById(int id) {
        for (int i = 0; i < count; i++) {
                if (books[i].getBookId() == id) {
                    for(int j = i;j < count-1; j++){
                        books[j] = books[j+1];
                    }
                    count--;

                    System.out.println("Book removed");
                    return;
                }
            }
            System.out.println("Id not found");
        }
    }

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library lib = new Library();

        User u1 = new User(101, "Vivek");
        u1.displayUser();

        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "OOP Concepts", "John Smith");
        Book b3 = new Book(3, "Data Structure", "Mark Lee");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.showBook();

        lib.issueBook(1);
        lib.issueBook(2);

        lib.returnBook(1);

        lib.showBook();

        lib.removeBookById(3);
        lib.searchBookById(2);
    }
}