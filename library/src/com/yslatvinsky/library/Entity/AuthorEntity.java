package src.com.yslatvinsky.library.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/** authorId serial NOT NULL,
 authorFio character varying NOT NULL,
 authorBio text,
 authorDataBirth date,
 CONSTRAINT author_pkey PRIMARY KEY (authorId)*/

@Entity
@Table(name="Author")
public class AuthorEntity {

    //authorId
    @Id
    @Column(name = "author_id")
    @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq", allocationSize = 1)
    //пишется только автогенерируемых значений
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    @NotNull
    private Integer authorId;

    //authorFio
    @Column(name = "author_fio")
    @NotNull
    private String authorFio;

    //authorBio
    @Column(name = "author_bio")
    private String authorBio;

    // authorDataBirth
    @Column(name = "author_data_birth")
    private Date authorDataBirth;

    // SetGet authorId
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getAuthorId() {
        return authorId;
    }


    // SetGet authorFio
    public void setAuthorFio(String authorFio) {
        this.authorFio = authorFio;
    }

    public String getAuthorFio() {
        return authorFio;
    }


    // SetGet  authorBio
    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    // SetGet authorDataBirth
    public void setAuthorDataBirth(Date authorDataBirth) {
        this.authorDataBirth = authorDataBirth;
    }

    public Date getAuthorDataBirth() {
        return authorDataBirth;
    }

}