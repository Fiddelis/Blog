package com.fiddelis.blog.services;

import com.fiddelis.blog.models.Article;
import com.fiddelis.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Optional<Article> getById(Long id) {
        return articleRepository.findById(id);
    }

    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    public Article save(Article post) {
        if(post.getId() == null) {
            post.setCreatedAt(LocalDateTime.now());
        }

        return articleRepository.save(post);
    }
}
