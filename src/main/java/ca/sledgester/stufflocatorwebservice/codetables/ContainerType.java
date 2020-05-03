package ca.sledgester.stufflocatorwebservice.codetables;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CONTAINER_TYPES")
@Data
public class ContainerType {

    @Id
    @Column(name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

}
