package com.yslatvinsky.library.DAO;


import com.yslatvinsky.library.Entity.AuthorEntity;
        import java.util.List;

public interface IAuthorDAO {

    public void addAuthor (AuthorEntity authorEntity);
    public List<AuthorEntity> listAuthorEntity();
    public void removeAuthor(Integer id);
}


