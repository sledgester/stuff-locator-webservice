package ca.sledgester.stufflocatorwebservice.article;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
    public List<Article> findByNameContainingIgnoreCase(String name);
    public Article findByNameIgnoreCase(String name);
}
