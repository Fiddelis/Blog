package com.fiddelis.blog.repository;

import com.fiddelis.blog.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
