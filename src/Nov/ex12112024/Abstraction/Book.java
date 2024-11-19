package Nov.ex12112024.Abstraction;

abstract class Book {
    protected String name;
    protected  String author;
    protected double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract String getDetails();
}
