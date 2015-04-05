
package src.com.yslatvinsky.library.DAO;

import java.util.List;

import src.com.yslatvinsky.library.Entity.BookEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BookDAO implements IBookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(BookEntity BookEntity) {
        sessionFactory.getCurrentSession().save(BookEntity);
    }

    public List<BookEntity> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeAuthor(Integer id) {
        BookEntity BookEntity = (BookEntity) sessionFactory.getCurrentSession().load(
                BookEntity.class, id);
        if (null != BookEntity) {
            sessionFactory.getCurrentSession().delete(BookEntity);
        }

    }
}