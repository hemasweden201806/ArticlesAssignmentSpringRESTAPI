package se.novare.article.news.articles;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {
}
