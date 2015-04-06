package src.com.yslatvinsky.library.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import src.com.yslatvinsky.library.Entity.BookEntity;
import src.com.yslatvinsky.library.DAO.BookDAO;
import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private BookDAO bookDAO;

    @Transactional
    public void addBook(BookEntity bookEntity) {
        bookDAO.addBook(bookEntity);
    }

    @Transactional
    public List<BookEntity> listBookEntity() {

        return bookDAO.listBookEntity();
    }

    @Transactional
    public void removeBook(Integer id) {bookDAO.removeBook(id);}
}



