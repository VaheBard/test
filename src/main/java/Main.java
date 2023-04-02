public class Main {
    public static void main(String[] args) {

        Author author = new Author("Bruce", "Eckel");
        Book book = author.newBook("Philosophy of Java");
        System.out.println(book.yearOfWrite);
        book.up();
        System.out.println(book.rating);
        book.up();
        book.up();
        System.out.println(book.rating);
    }
}

