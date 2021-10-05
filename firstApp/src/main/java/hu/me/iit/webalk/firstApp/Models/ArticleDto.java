package hu.me.iit.webalk.firstApp.Models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ArticleDto {

    @NotBlank
    private String author;
    @NotBlank
    private String title;
    @Range(min=1, max=30, message = "Az oldal szám nem megfelelő, 1 és 30 között kell lennie")
    private Integer pages;
    @Min(1)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "ArticleDto{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", id=" + id +
                '}';
    }
}
