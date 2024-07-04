package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String title; private String content;
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String toString() {
        return "ArticleForm{ " +
                "title : " + this.title +
                ", content : " + this.content + "}";
    }

    public Article toEntity() {
        return new Article(null, this.title, this.content);
    }
}
