package ca.sledgester.stufflocatorwebservice.room;

import ca.sledgester.stufflocatorwebservice.container.Container;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROOMS")
@Data
public class Room {

    @Id
    @SequenceGenerator(name = "roomSeqGen", sequenceName = "roomSeq")
    @GeneratedValue(generator = "roomSeqGen")
    @Column(name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name="picture_string")
    @Lob
    private String pictureString;

    @OneToMany(mappedBy = "room")
    private List<Container> containers;

}
