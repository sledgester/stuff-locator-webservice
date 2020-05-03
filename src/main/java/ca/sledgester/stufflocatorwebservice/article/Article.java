package ca.sledgester.stufflocatorwebservice.article;

import ca.sledgester.stufflocatorwebservice.container.Container;
import ca.sledgester.stufflocatorwebservice.person.Person;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ARTICLES")
@Data
public class Article {

    @Id
    @SequenceGenerator(name = "articleSeqGen", sequenceName = "articleSeq")
    @GeneratedValue(generator = "articleSeqGen")
    @Column(name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column(name = "value")
    private BigDecimal value;

    @Column (name="picture_string")
    @Lob
    private String pictureString;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Container container;

}
