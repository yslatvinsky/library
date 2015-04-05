package src.com.yslatvinsky.library.DAO;


import src.com.yslatvinsky.library.Entity.AuthorEntity;
        import java.util.List;

public interface IAuthorDAO {

    public void addAuthor (AuthorEntity authorEntityEntity);
    public List<AuthorEntity> listAuthorEntity();
    public void removeAuthor(Integer id);
}


