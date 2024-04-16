package Exercises;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.printf("Book Title: %s%n", getTitle());
        System.out.printf("Book Author: %s%n", getAuthor());

    }
}
