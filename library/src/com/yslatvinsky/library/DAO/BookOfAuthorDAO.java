package src.com.yslatvinsky.library.DAO;
import java.util.List;

import src.com.yslatvinsky.library.Entity.BookOfAuthorEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BookOfAuthorDAO implements IBookOfAuthorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(BookOfAuthorEntity BookOfAuthorEntity) {
        sessionFactory.getCurrentSession().save(BookOfAuthorEntity);
    }

    public List<BookOfAuthorEntity> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeAuthor(Integer id) {
        BookOfAuthorEntity BookOfAuthorEntity = (BookOfAuthorEntity) sessionFactory.getCurrentSession().load(
                BookOfAuthorEntity.class, id);
        if (null != BookOfAuthorEntity) {
            sessionFactory.getCurrentSession().delete(BookOfAuthorEntity);
        }

    }
}
