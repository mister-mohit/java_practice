

public class bookClass {

    public static class Book {
        String title;
        String author;
        String publisherName;
        double price;
        String isbn;

        public Book(String title, String author, String publisherName, double price, String isbn) {
            this.title = title;
            this.author = author;
            this.publisherName = publisherName;
            this.price = price;
            this.isbn = isbn;
        }

        public void display_book_info(){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisherName);  
        }

        public void display_book_price(){
            System.out.println("Price: $" + price);
        }

        public void display_book_isbn(){
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Psychology of money", "Morgan Housel", "Penguin House", 250.6, "1234qwer90");

        book1.display_book_info();
        book1.display_book_price();
        book1.display_book_isbn();
    }
}
