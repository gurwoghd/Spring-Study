package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String NewArticleForm() {
        return "new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());

        // transform dto to entity
        Article article = form.toEntity();

        // use repository to store entity in db
        Article saved = articleRepository.save(article);
        return "";
    }
}
