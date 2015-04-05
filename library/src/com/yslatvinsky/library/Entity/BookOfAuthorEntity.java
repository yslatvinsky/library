package src.com.yslatvinsky.library.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="book_of_author")
public class BookOfAuthorEntity {


    /**id serial NOT NULL,
     book_id integer NOT NULL,
     author_id integer,*/

    //id
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @NotNull
    private Integer id;

    // book_id
    @Column(name="book_id")
    @NotNull
    private Integer book_id;

    // author_id
    @Column(name="author_id")
    @NotNull
    private Integer author_id;



}
