package se.novare.article.news.articles;


import se.novare.article.news.comment.Comment;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "articlestable")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private String authorName;

    @OneToMany
    private List<Comment> comments;

    public Article(){}

    public Article(Long id, String title, String body, String authorName) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.authorName = authorName;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

