package it.boot5.dao;

import it.boot5.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BookDao {
    List<Book> findAll();
    Book findById(Long id);
    int insert(Book book);
    int update(Book book);
    int delete(Long id);

}
