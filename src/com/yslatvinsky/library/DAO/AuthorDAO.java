
package com.yslatvinsky.library.DAO;


import com.yslatvinsky.library.Entity.AuthorEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AuthorDAO implements IAuthorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addAuthor(AuthorEntity AuthorEntity) {
        sessionFactory.getCurrentSession().save(AuthorEntity);
    }

    public List<AuthorEntity> listAuthorEntity() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeAuthor(Integer id) {
        AuthorEntity AuthorEntity = (AuthorEntity) sessionFactory.getCurrentSession().load(
                AuthorEntity.class, id);
        if (null != AuthorEntity) {
            sessionFactory.getCurrentSession().delete(AuthorEntity);
        }

    }
}