package src.com.yslatvinsky.library.DAO;

import src.com.yslatvinsky.library.Entity.BookEntity;

import java.util.List;

/**
 * Created by YAROSLAV on 05.04.2015.
 */
public interface IBookDAO {
    public void addBook(BookEntity bookEntity);
    public List<BookEntity> listBook();
    public void removeBook(Integer id);

    void save(BookEntity entity);
}