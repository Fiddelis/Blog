package com.fiddelis.blog.controllers;

import com.fiddelis.blog.models.Article;
import com.fiddelis.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Article> articles = articleService.getAll();
        Collections.reverse(articles);
        model.addAttribute("articles", articles);
        return "index";
    }
}
