package src.com.yslatvinsky.library.DAO;

import src.com.yslatvinsky.library.Entity.BookOfAuthorEntity;

import java.util.List;

/**
 * Created by YAROSLAV on 05.04.2015.
 */
public interface IBookOfAuthorDAO {
    public void addAuthor(BookOfAuthorEntity bookOfAuthorEntity);
    public List<BookOfAuthorEntity> listBookOfAuthor();
    public void removeBookOfAuthor(Integer id);

    void save(BookOfAuthorDAO entity);
}