package hu.me.iit.webalk.firstApp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepositority articleRepositority;
    private final int MAX_SIZE_OF_ARICALES = 10;
    @Override
    public List<ArticleDto> findAll() {
        return articleRepositority.findAll();
    }

    @Override
    public ArticleDto getById(Long id) {
        return articleRepositority.getById(id);
    }

    @Override
    public Long save(ArticleDto articleDto) {

        if(articleRepositority.findAll().size() >= MAX_SIZE_OF_ARICALES){
            throw new TooMuchArticleException();
        }
        return articleRepositority.save(articleDto);

    }

    @Override
    public void deleteById(Long id) {
        articleRepositority.deleteById(id);
    }
}
