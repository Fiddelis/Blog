package com.fiddelis.blog.controllers;

import com.fiddelis.blog.models.Article;
import com.fiddelis.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Optional<Article> optionalArticle = articleService.getById(id);

        if(optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            model.addAttribute("article", article);
            return "article";
        } else {
            return "404";
        }
    }
}
