package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // annotation for logging
public class ArticleController {
    @Autowired // automatically connect using objects made by spring boot
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String NewArticleForm() {
        return "new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
//        System.out.println(form.toString());
        log.info(form.toString());

        // transform dto to entity
        Article article = form.toEntity();
        // Replace System.out.println to logging
//        System.out.println(article.toString());
        log.info(article.toString());

        // use repository to store entity in db
        Article saved = articleRepository.save(article);
        // Replace System.out.println to loggin
//        System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }
}
