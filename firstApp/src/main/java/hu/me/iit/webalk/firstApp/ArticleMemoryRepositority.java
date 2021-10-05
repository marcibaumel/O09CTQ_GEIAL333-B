package hu.me.iit.webalk.firstApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleMemoryRepositority implements ArticleRepositority {
    private final List<ArticleDto> articles = new ArrayList<>();

    private int findArticleByID(Long id){
        int found = -1;
        for (int i = 0; i<articles.size(); i++){
            if(articles.get(i).getId().equals(id)){
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<ArticleDto> findAll() {
        return articles;
    }

    @Override
    public ArticleDto getById(Long id) {
        return null;
    }

    @Override
    public Long save(ArticleDto articleDto) {
        int found = findArticleByID(articleDto.getId());
        if (found != -1){
            ArticleDto foundArticle = articles.get(found);
            foundArticle.setAuthor((articleDto.getAuthor()));
            foundArticle.setPages(articleDto.getPages());
        }
        else {
            articles.add(articleDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findArticleByID(id);
        if(found != -1){
            articles.remove(found);
        }
    }
}
