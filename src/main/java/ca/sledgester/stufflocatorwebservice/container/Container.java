package ca.sledgester.stufflocatorwebservice.container;

import ca.sledgester.stufflocatorwebservice.room.Room;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CONTAINERS")
@Data
public class Container {

    @Id
    @SequenceGenerator(name = "containerSeqGen", sequenceName = "containerSeq")
    @GeneratedValue(generator = "containerSeqGen")
    @Column(name = "id")
    private Long id;

    @Column (name = "number")
    private int number;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private int type;

    @Column(name = "shelf_number")
    private int shelfNumber;

    @ManyToOne
    private Room room;

}
