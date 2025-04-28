package it.boot5.model;


import org.springframework.format.annotation.DateTimeFormat;


public class Book {
    private String title;
    private String author;
    private String publisher;
    private Double price;
    private String ISBN;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String publishDate;
    private String introduce;

    public Book(String title, String author, String publisher, Double price, String ISBN, String publishDate, String introduce) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.introduce = introduce;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}