package src.com.yslatvinsky.library.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="book_of_author")
public class BookOfAuthorEntity {


    /**id serial NOT NULL,
     bookId integer NOT NULL,
     authorId integer,*/

    //id
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @NotNull
    private Integer id;

    // bookId
    @Column(name="book_id")
    @NotNull
    private Integer bookId;

    // authorId
    @Column(name="author_id")
    @NotNull
    private Integer authorId;



}
