package src.com.yslatvinsky.library.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="Book")
public class BookEntity {

    @Id
    @Column(name = "book_id")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq", allocationSize = 1)

    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    @NotNull
    private Integer bookId;

    @Column(name = "book_name")
    @NotNull
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_public_date")
    private Date bookPublicDate;

    @Column(name = "book_quantity")
    private Integer bookQuantity;

    @Column(name = "book_genre")
    private String bookGenre;


    // bookId
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookId() {
        return bookId;
    }

    //bookAuthor
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }


    //bookPublicDate
    public void setBook_author(Date book_public_date) {
        this.bookPublicDate = book_public_date;
    }

    public Date getBook_author() {
        return bookPublicDate;
    }


    //bookQuantity
    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    //bookGenre
    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookGenre() {
        return bookGenre;

    }

}
