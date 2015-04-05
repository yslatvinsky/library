package src.com.yslatvinsky.library.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="Book")
public class BookEntity {

    @Id
    @Column(name="book_id")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq",allocationSize = 1)

    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    @NotNull
    private Integer book_id;

    @Column(name="book_name")
    @NotNull
    private String book_name;

    @Column(name="book_author")
    private String book_author;

    @Column(name="book_public_date")
    private Date book_public_date;

    @Column(name="book_quantity")
    private Integer book_quantity;

    @Column(name="book_genre")
    private String book_genre;


  // book_id
    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }
    public Integer getBook_id() {
        return book_id;
    }

    //book_author
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
    public String getBook_author() {
        return book_author;


    //book_public_date
    public void setBook_author(Date book_public_date) {
        this.book_public_date = book_public_date;
    }
    public Date getBook_author() {
        return book_author;
    }
    //book_quantity
    public void setBook_quantity(Integer book_quantity) {
        this.book_quantity = book_quantity;
    }
    public Integer getBook_quantity() {
        return book_quantity;
    }

    //book_genre
    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }
    public String getBook_genre() {
        return book_genre;

}


