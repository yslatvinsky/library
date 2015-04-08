package com.yslatvinsky.library.Service;
import com.yslatvinsky.library.Entity.BookOfAuthorEntity;

import java.util.List;

public interface IBookOfAuthorService {
    public void addBookOfAuthor(BookOfAuthorEntity BookOfAuthorEntity);
    public List<BookOfAuthorEntity> listBookOfAuthorEntity();
    public void removeBookOfAuthor(Integer id);
}







