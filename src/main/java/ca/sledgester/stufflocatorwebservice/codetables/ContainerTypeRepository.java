package ca.sledgester.stufflocatorwebservice.codetables;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "containerTypes", path = "containerTypes")
public interface ContainerTypeRepository extends PagingAndSortingRepository<ContainerType, Long> {
}
