package com.practice;

class BookShelf {
    public static void main(String[] args) {
        Book[] books = new Book[6];

//        Book[] programmingBooks = new ProgrammingBook[3];
        books[0] = new ProgrammingBook("PrB123", "Code 1", 23.3, "Babaha", "Bython", "ByCharm");
        books[1] = new ProgrammingBook("PrB124", "Code 2", 23.4, "Baboha", "java", "JaCharm");
        books[2] = new ProgrammingBook("PrB125", "Code 3", 23.5, "Babuha", "Baython", "BayCharm");
//        Book[] fictionBooks = new FictionBook[3];
        books[3] = new FictionBook("F123", "F 1", 33.3, "BabaNo", "horror");
        books[4] = new FictionBook("F124", "F 2", 53.4, "BaboNi", "Viễn tưởng 1");
        books[5] = new FictionBook("F125", "F 3", 63.5, "BabuMo", "Viễn tưởng 1");

        calculateBooksPriceSum(books);
    }

    private static void calculateBooksPriceSum(Book[] books) {
        double sumPrice = 0.0;
        for (int i = 0; i < books.length; i++) {
            sumPrice += books[i].getPrice();

        }
        System.out.println("Giá tất cả sách là: " + sumPrice);
    }

    

}

public class Book {
    private String bookCode;
    private String name;
    private double price;
    private String author;

    public Book(String bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;

    }

    public String getBookCode() {
        return bookCode;
    }
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getBookPrice() {
        return price;
    }
}


class ProgrammingBook extends Book {
    private String language;
    private String framework;
    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getFramework() {
        return framework;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public double getBookPrice() {
        double bookPrice = super.getBookPrice();
        double programmingBookPrice = bookPrice * 0.95;
        return programmingBookPrice;
    }
}

class FictionBook extends Book {
    private String category;
    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getBookPrice() {
        double bookPrice = super.getPrice();
        double fictionBookPrice = bookPrice * 0.93;
        return fictionBookPrice;
    }
}