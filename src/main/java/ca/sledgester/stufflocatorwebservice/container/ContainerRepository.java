package ca.sledgester.stufflocatorwebservice.container;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "containers", path = "containers")
public interface ContainerRepository extends PagingAndSortingRepository<Container, Long> {
    public List<Container> findByDescriptionContainingIgnoreCase(String description);
    public Container findByDescriptionIgnoreCase(String description);
}
