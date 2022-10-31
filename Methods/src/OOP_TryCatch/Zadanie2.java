package OOP_TryCatch;

import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) {
        Book b1 = new Book(1212,"Matem","shynybekov");
        Book b2 = new Book(1212,"Matem","shynybekov");
        Book b3 = new Book(1212,"Matem","shynybekov");
        Book b4 = new Book(1212,"Matem","shynybekov");
        Book b5 = null;
        Book b6 = new Book(1212,"Matem","shynybekov");
        Book b7 = new Book(1212,"Matem","shynybekov");
        Book b8 = new Book(1212,"Matem","shynybekov");
        Book b9 = new Book(1212,"Matem","shynybekov");
        Book b10 = new Book(1212,"Matem","shynybekov");
        Book b11 = new Book(1212,"Matem","shynybekov");
        Book b12 = new Book(1212,"Matem","shynybekov");
        Book b13 = new Book(1212,"Matem","shynybekov");
        Book b14 = new Book(1212,"Matem","shynybekov");
        Book b15 = new Book(1212,"Matem","shynybekov");
        Book b16 = new Book(1212,"Matem","shynybekov");
        Book b17 = new Book(1212,"Matem","shynybekov");
        Book b18 = new Book(1212,"Matem","shynybekov");
        Book b19 = null;
        Book b20 = new Book(1212,"Matem","shynybekov");
        Book b21 = null;
        Book b22 = new Book(1212,"Matem","shynybekov");
        Library l1 = new Library("Almaty", "Almaty");
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.addBook(b4);
        l1.addBook(b5);
        l1.addBook(b6);
        l1.addBook(b7);
        l1.addBook(b8);
        l1.addBook(b9);
        l1.addBook(b10);
        l1.addBook(b11);
        l1.addBook(b12);
        l1.addBook(b13);
        l1.addBook(b14);
        l1.addBook(b15);
        l1.addBook(b16);
        l1.addBook(b17);
        l1.addBook(b18);
        l1.addBook(b19);
        l1.addBook(b20);
        l1.addBook(b21);
        l1.addBook(b22);
        l1.printBooks();
    }
}
class Book {
    protected int id;
    protected String name;
    protected String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getData() {
        return getId() + " " + getName() + " " + getAuthor();
    }
}
class Library {
    protected String name;
    protected String city;
    protected Book books[] = new Book[20];
    protected int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void printBooks() {
        for (int i = 0; i < index; i++) {
            try {
                System.out.println(books[i].getData());
            } catch (NullPointerException e) {
                System.out.println("The book is empty");
            }
        }
    }
    public void addBook(Book book) {
        try {
            books[index] = book;
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
    }

    public String getData() {
        return getName() + " " + getCity();
    }
}




