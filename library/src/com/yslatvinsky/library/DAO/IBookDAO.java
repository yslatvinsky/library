package src.com.yslatvinsky.library.DAO;

import src.com.yslatvinsky.library.Entity.BookEntity;
import java.util.List;

public interface IBookDAO {

    public void addBook (BookEntity BookEntity);
    public List<BookEntity> listBookEntity();
    public void removeBook(Integer id);
}

