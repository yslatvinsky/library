package com.yslatvinsky.library.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yslatvinsky.library.Entity.AuthorEntity;
import com.yslatvinsky.library.DAO.AuthorDAO;
import java.util.List;

@Service
public class AuthorService implements IAuthorService{

    @Autowired
    private AuthorDAO authorDAO;

    @Transactional
    public void addAuthor(AuthorEntity authorEntity) {
        authorDAO.addAuthor(authorEntity);
    }

    @Transactional
    public List<AuthorEntity> listAuthorEntity() {

        return authorDAO.listAuthorEntity();
    }

    @Transactional
    public void removeAuthor(Integer id) {
        authorDAO.removeAuthor(id);
    }
}


