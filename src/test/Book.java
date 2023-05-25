package test;

import test.Author;

public class Book {
    String title;
    Author name;
    double  price;

    public Book(String title, Author name, double price) {
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public String toString(){
        return "title: " +title +"\nauthor: "+name+" \nprice "+price;
    }
}
