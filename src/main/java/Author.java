import java.time.LocalDate;

public class Author {
    String name;
    String surname;
    int amountOfWrittenBooks;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.amountOfWrittenBooks = 0;
    }
    public Book newBook(String title){
        amountOfWrittenBooks++;
        return new Book(title, this, LocalDate.now().getYear());
    }

    public int getAmountOfWrittenBooks() {
        return amountOfWrittenBooks;
    }
}
