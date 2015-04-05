package src.com.yslatvinsky.library.DAO;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import src.com.yslatvinsky.library.Entity.BookEntity;

@Transactional(readOnly = true)
public class BookOfAuthorDAO implements IBookOfAuthorDAO{
    private IBookOfAuthorDAO dao;
    public void setDao(IBookOfAuthorDAO dao)

    {

        this.dao = dao;

    }
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)

    public void saveEntity(BookOfAuthorDAO entity)

    {

        dao.save(entity);

    }



}
