package src.com.yslatvinsky.library.Service;

import src.com.yslatvinsky.library.Entity.BookEntity;

import java.util.List;

public interface IBookService{

        public void addBook(BookEntity BookEntity);
        public List<BookEntity> listBookEntity();
        public void removeBook(Integer id);
}
