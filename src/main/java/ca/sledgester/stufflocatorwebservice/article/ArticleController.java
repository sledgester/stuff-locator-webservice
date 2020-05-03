package ca.sledgester.stufflocatorwebservice.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @RequestMapping(value="/controllers/allArticles", method= RequestMethod.GET)
    public List<Article> getAllArticles() {

        List<Article> articleList = new ArrayList<>();

        articleList = (List<Article>) articleRepository.findAll();

        return articleList;
    }
}
