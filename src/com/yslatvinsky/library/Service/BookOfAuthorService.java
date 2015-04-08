package com.yslatvinsky.library.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yslatvinsky.library.Entity.BookOfAuthorEntity;
import com.yslatvinsky.library.DAO.BookOfAuthorDAO;
import java.util.List;

@Service
public class BookOfAuthorService implements IBookOfAuthorService{

    @Autowired
    private BookOfAuthorDAO bookOfAuthorDAO;

    @Transactional
    public void addBookOfAuthor(BookOfAuthorEntity BookOfAuthorEntity) {
        bookOfAuthorDAO.addBookOfAuthor(BookOfAuthorEntity);
    }

    @Transactional
    public List<BookOfAuthorEntity> listBookOfAuthorEntity() {

        return bookOfAuthorDAO.listBookOfAuthorEntity();
    }

    @Transactional
    public void removeBookOfAuthor(Integer id) {
        bookOfAuthorDAO.removeBookOfAuthor(id);
    }
}


