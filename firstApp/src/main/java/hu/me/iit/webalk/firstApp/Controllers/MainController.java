package hu.me.iit.webalk.firstApp.Controllers;

import hu.me.iit.webalk.firstApp.Models.ArticleDto;
import hu.me.iit.webalk.firstApp.Services.ArticleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/article")
public class MainController {

    private final ArticleService articleService;

    public MainController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> allArticles() {
        return articleService.findAll();
    }

    @PostMapping(path="")
    public void newArticle(@RequestBody @Valid ArticleDto articleDto) {
        articleService.save(articleDto);
    }

    //TODO give the id parameter
    @PutMapping(path="/")
    public void replaceArticle(@RequestBody @Valid ArticleDto articleDto) {
        articleService.save(articleDto);
    }

    @DeleteMapping (path="/{id}")
    public void deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteById(id);
    }
}