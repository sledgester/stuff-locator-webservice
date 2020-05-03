package ca.sledgester.stufflocatorwebservice.room;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
public interface RoomRepository extends PagingAndSortingRepository<Room, Long> {
    public List<Room> findByNameContainingIgnoreCase(String name);
    public Room findByNameIgnoreCase(String name);
}
