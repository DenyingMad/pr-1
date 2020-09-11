package com.mirea;

public class Book {
    private String name, author;
    private int pagesLeft, pagesRead;
    {
        name = "no name";
        author = "no author";
        pagesLeft = 0;
        pagesRead = 0;
    }

    public Book(String name){
        this.name = name;
    }

    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.pagesLeft = pages;
    }

    public void readBook(int sheets){
        this.pagesLeft -= sheets;
        this.pagesRead += sheets;
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

    public int getPagesLeft() {
        return pagesLeft;
    }

    public void setPages(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    @Override
    public String toString() {
        return "Book: " + name + "\nAuthor: " + author +
                "\nPages read: " + pagesRead + "\nPages left: " + pagesLeft +
                "\nPages amount: " + (pagesLeft + pagesRead) + "\n";
    }
}
