package hu.beadando.library.service;

import hu.beadando.library.model.Author;
import hu.beadando.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAll() { return authorRepository.findAll(); }
    public Optional<Author> getById(Long id) { return authorRepository.findById(id); }
    public Author save(Author author) { return authorRepository.save(author); }
    public void delete(Long id) { authorRepository.deleteById(id); }
}