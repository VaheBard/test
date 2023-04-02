import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void newBook() {
        Author author = new Author("Author's name", "Author's surname");
        author.newBook("title");

        int actual  = author.getAmountOfWrittenBooks();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }
}