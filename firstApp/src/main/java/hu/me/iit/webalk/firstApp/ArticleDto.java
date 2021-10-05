package hu.me.iit.webalk.firstApp;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ArticleDto {
    /*
    1, mvn dependency
    2, javax.validation.constraints
    3, validation implementations
    4, give the validation rules
    +Exceptions generating in the background
     */

    @NotBlank
    private String author;
    @NotBlank
    private String title;
    @Range(min=1, max=30)
    private Integer pages;
    @Min(1)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
