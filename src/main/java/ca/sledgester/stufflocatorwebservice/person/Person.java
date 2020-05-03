package ca.sledgester.stufflocatorwebservice.person;

import ca.sledgester.stufflocatorwebservice.article.Article;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PEOPLE")
@Data
public class Person {

    @Id
    @SequenceGenerator(name = "personSeqGen", sequenceName = "personSeq")
    @GeneratedValue(generator = "personSeqGen")
    @Column(name = "id")
    private Long id;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "age")
    private int age;

    @OneToMany(mappedBy = "person")
    private List<Article> articles;
}
