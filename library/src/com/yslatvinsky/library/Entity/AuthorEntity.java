package src.com.yslatvinsky.library.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/** author_id serial NOT NULL,
 author_fio character varying NOT NULL,
 author_bio text,
 author_data_birth date,
 CONSTRAINT author_pkey PRIMARY KEY (author_id)*/

@Entity
@Table(name="Author")
public class AuthorEntity {

    //author_id
    @Id
    @Column(name = "author_id")
    @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq", allocationSize = 1)
    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    @NotNull
    private Integer author_id;

    //author_fio
    @Column(name = "author_fio")
    @NotNull
    private String author_fio;

    //author_bio
    @Column(name = "author_bio")
    private String author_bio;

    // author_data_birth
    @Column(name = "author_data_birth")
    private Date author_data_birth;

    // SetGet author_id
    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }


    // SetGet author_fio
    public void setAuthor_fio(String author_fio) {
        this.author_fio = author_fio;
    }

    public String getAuthor_fio() {
        return author_fio;
    }


    // SetGet  author_bio
    public void setAuthor_bio(String author_bio) {
        this.author_bio = author_bio;
    }

    public String getAuthor_bio() {
        return author_bio;
    }

    // SetGet author_data_birth
    public void setAuthor_data_birth(Date author_data_birth) {
        this.author_data_birth = author_data_birth;
    }

    public Date getAuthor_data_birth() {
        return author_data_birth;
    }

}