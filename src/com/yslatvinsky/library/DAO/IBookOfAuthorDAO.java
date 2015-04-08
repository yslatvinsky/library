package com.yslatvinsky.library.DAO;

import com.yslatvinsky.library.Entity.BookOfAuthorEntity;
import java.util.List;

public interface IBookOfAuthorDAO {

    public void addBookOfAuthor (BookOfAuthorEntity BookOfAuthorEntity);
    public List<BookOfAuthorEntity> listBookOfAuthorEntity();
    public void removeBookOfAuthor(Integer id);
}

