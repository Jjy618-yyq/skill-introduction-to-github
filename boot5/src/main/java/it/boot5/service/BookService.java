package it.boot5.service;

import it.boot5.dao.BookDao;
import it.boot5.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookService {

    private final BookDao bookMapper;

    public BookService(BookDao bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    public Book findById(Long id) {
        return bookMapper.findById(id);
    }


    public int delete(Long id) {
        return bookMapper.delete(id);
    }

    public void save(Book book) {
    }
}