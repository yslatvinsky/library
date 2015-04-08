
package com.yslatvinsky.library.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.yslatvinsky.library.Entity.BookEntity;

import java.util.List;


@Repository
public class BookDAO implements IBookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(BookEntity BookEntity) {
        sessionFactory.getCurrentSession().save(BookEntity);
    }

    public List<BookEntity> listBookEntity() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeBook(Integer id) {
        BookEntity BookEntity = (BookEntity) sessionFactory.getCurrentSession().load(
                BookEntity.class, id);
        if (null != BookEntity) {
            sessionFactory.getCurrentSession().delete(BookEntity);
        }

    }
}