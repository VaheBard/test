import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
   public void up() {
        Author author = new Author("Author's nam", "Author's surname");
        Book book = new Book("Books title",author , 2023);

        book.up();
        int actualRating = book.getRating();
        int expectRating = 4;

        Assertions.assertEquals(actualRating, expectRating);
    }

    @Test
    void append() {
        Book book = new Book("Title", new Author("Name", "Surname"), 2023);
        String testTxt = "any text";
        book.append(testTxt);

        String actual = book.text;
        String expect = "any text";

        Assertions.assertEquals(actual, expect);
    }
    @Test
    public void getText(){
        Book book = new Book("title", new Author("author", "author"), 2023);

        String actual = book.getText();
        String expected = "";
    }
}