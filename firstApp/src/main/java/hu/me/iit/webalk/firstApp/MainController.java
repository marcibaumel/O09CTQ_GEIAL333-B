package hu.me.iit.webalk.firstApp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private final List<ArticleDto> articles = new ArrayList<>();

    @GetMapping(path="/articles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> allArticles(){
        return articles;
    }

    @PostMapping(path="articles/")
    public void newArticle(@RequestBody @Valid ArticleDto articleDto){
        articles.add(articleDto);
    }

    @PutMapping(path="articles/{id}")
    public void replaceArticle(@PathVariable("id") String id, @RequestBody @Valid ArticleDto articleDto){
        int found = findArticleByID(id);

        if(found != -1){
            ArticleDto foundedDto = articles.get(found);
            foundedDto.setPages(articleDto.getPages());
            foundedDto.setAuthor(articleDto.getAuthor());
        }
    }

    @GetMapping(path="articles/{id}")
    public ArticleDto getNameById(@PathVariable("id") String id){
        int found = findArticleByID(id);
        ArticleDto foundedDto = new ArticleDto();

        if(found != -1){
            foundedDto = articles.get(found);
        }
        return foundedDto;
    }

    @DeleteMapping (path="articles/{id}")
    public void deleteArticle(@PathVariable("id") String id){
        int found = findArticleByID(id);
        if(found != -1){
            articles.remove(found);
        }
    }

    //Find article by the given id int the mock DTO
    private int findArticleByID(String id){
        int found = -1;
        for (int i = 0; i<articles.size(); i++){
            if(articles.get(i).getTitle().equals(id)){
                found = i;
                break;
            }
        }
        return found;
    }
}
