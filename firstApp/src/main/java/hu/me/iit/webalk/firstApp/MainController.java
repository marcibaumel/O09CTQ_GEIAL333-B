package hu.me.iit.webalk.firstApp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/article")
public class MainController {

    //OLD VERSION
    //private final List<ArticleDto> articles = new ArrayList<>();

    private ArticleService articleService;
    @GetMapping(path="/articles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> allArticles(){
        return articleService.findAll();
    }

    @PostMapping(path="articles/")
    public void newArticle(@RequestBody @Valid ArticleDto articleDto){
        articleService.save(articleDto);
    }

    @PutMapping(path="articles/{id}")
    public void replaceArticle(@PathVariable("id") String id, @RequestBody @Valid ArticleDto articleDto){
       articleService.save(articleDto);
    }

    @GetMapping(path="articles/{id}")
    public ArticleDto getNameById(@PathVariable("id") Long id){
        return articleService.getById(id);
    }

    @DeleteMapping (path="articles/{id}")
    public void deleteArticle(@PathVariable("id") Long id){
       articleService.deleteById(id);
    }

}
