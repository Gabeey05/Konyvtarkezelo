package hu.beadando.library.service;

import hu.beadando.library.model.Book;
import hu.beadando.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() { return bookRepository.findAll(); }
    public Optional<Book> getById(Long id) { return bookRepository.findById(id); }
    public Book save(Book book) { return bookRepository.save(book); }
    public void delete(Long id) { bookRepository.deleteById(id); }
}