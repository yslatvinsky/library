package src.com.yslatvinsky.library.DAO;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import src.com.yslatvinsky.library.Entity.BookEntity;

@Transactional(readOnly = true)
public class BookDAO implements IBookDAO {
    private IBookDAO dao;
    public void setDao(IBookDAO dao)

    {

        this.dao = dao;

    }
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)

    public void saveEntity(BookEntity entity)

    {

        dao.save(entity);

    }


}
