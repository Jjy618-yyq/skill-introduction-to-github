//package it.boot5.service;
//
//import it.boot5.dao.BookDao;
//import it.boot5.model.Book;
//import it.boot5.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class BookServiceImpl implements BookService {
//    @Autowired
//    private BookDao bookDao;
//
//    @Override
//    public List<Book> getAllBooks() {
//        return bookDao.getAllBooks();
//    }
//
//    @Override
//    public Integer addBook(Book book) {
//        return bookDao.add(book); // 实现 addBook 方法
//    }
//}
