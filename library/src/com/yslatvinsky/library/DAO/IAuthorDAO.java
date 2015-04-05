package src.com.yslatvinsky.library.DAO;

import src.com.yslatvinsky.library.Entity.AuthorEntity;

import java.util.List;

/**
 * Created by YAROSLAV on 05.04.2015.
 */
public interface IAuthorDAO {
    public void addAuthor(AuthorEntity authorEntity);
    public List<AuthorEntity> listAuthor();
    public void removeBook(Integer id);

    void save(AuthorEntity entity);
}