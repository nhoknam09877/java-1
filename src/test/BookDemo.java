package test;

import test.Author;
import test.Book;

public class BookDemo {
    public static void main(String[] args) {
        Author a= new Author("Russel", "Winder");
        Book b=new Book("Developing Java Software",a, 79.75);
        System.out.println(b);


    }
}
