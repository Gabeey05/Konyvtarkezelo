package hu.beadando.library.service;

import hu.beadando.library.model.Author;
import hu.beadando.library.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorServiceTest {

    private AuthorService authorService = new AuthorService(Mockito.mock(AuthorRepository.class));

    @Test
    public void findAllReturnsList() {
        assertNotNull(authorService.getAll());
    }
}