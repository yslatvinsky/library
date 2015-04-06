package src.com.yslatvinsky.library.Service;

import src.com.yslatvinsky.library.Entity.AuthorEntity;

import java.util.List;

public interface IAuthorService{
    public void addAuthor(AuthorEntity authorEntity);
    public List<AuthorEntity> listAuthorEntity();
    public void removeAuthor(Integer id);
}
