package hu.beadando.library.service;
import hu.beadando.library.model.Book;
import hu.beadando.library.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
public class BookServiceTest {
    private BookService bookService = new BookService(Mockito.mock(BookRepository.class));

    @Test

    public void findAllReturnsList() {

        assertNotNull(bookService.getAll());

    }

}