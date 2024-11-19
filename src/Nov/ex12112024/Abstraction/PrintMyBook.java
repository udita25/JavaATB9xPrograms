package Nov.ex12112024.Abstraction;

class PrintMyBook extends Book{


    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);

    }



    @Override
    String getDetails() {
        return "Name: "+name+"\nAuthor: "+author+"\nPrice: "+price;
    }
}
