package src.com.yslatvinsky.library.DAO;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import src.com.yslatvinsky.library.Entity.AuthorEntity;

@Transactional(readOnly = true)
public class AuthorDAO implements IAuthorDAO{
    private IAuthorDAO dao;
    public void setDao(IAuthorDAO dao)

    {

        this.dao = dao;

    }
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)

    public void saveEntity(AuthorEntity entity)

    {

        dao.save(entity);

    }





}
