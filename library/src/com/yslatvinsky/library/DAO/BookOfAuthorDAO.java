package src.com.yslatvinsky.library.DAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import src.com.yslatvinsky.library.Entity.BookOfAuthorEntity;

import java.util.List;


@Repository
public class BookOfAuthorDAO implements IBookOfAuthorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBookOfAuthor(BookOfAuthorEntity BookOfAuthorEntity) {
        sessionFactory.getCurrentSession().save(BookOfAuthorEntity);
    }

    public List<BookOfAuthorEntity> listBookOfAuthorEntity() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeBookOfAuthor(Integer id) {
        BookOfAuthorEntity BookOfAuthorEntity = (BookOfAuthorEntity) sessionFactory.getCurrentSession().load(
                BookOfAuthorEntity.class, id);
        if (null != BookOfAuthorEntity) {
            sessionFactory.getCurrentSession().delete(BookOfAuthorEntity);
        }

    }
}
