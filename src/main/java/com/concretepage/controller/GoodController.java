package com.concretepage.controller;
import java.util.List;

import com.concretepage.entity.Good;
import com.concretepage.service.GoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("user")
public class GoodController {
//    @Autowired
//    private GoodServices goodService;
//    @GetMapping("article/{id}")
//    public ResponseEntity<Good> getArticleById(@PathVariable("id") Integer id) {
//        Good good = goodService.getArticleById(id);
//        return new ResponseEntity<Good>(good, HttpStatus.OK);
//    }
//    @GetMapping("articles")
//    public ResponseEntity<List<Good>> getAllArticles() {
//        List<Good> list = goodService.getAllArticles();
//        return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
//    }
//    @PostMapping("article")
//    public ResponseEntity<Void> addArticle(@RequestBody Good article, UriComponentsBuilder builder) {
//        boolean flag = goodService.addArticle(article);
//        if (flag == false) {
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//    @PutMapping("article")
//    public ResponseEntity<Good> updateArticle(@RequestBody Good article) {
//        goodService.updateArticle(article);
//        return new ResponseEntity<Good>(article, HttpStatus.OK);
//    }
//    @DeleteMapping("article/{id}")
//    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
//        articleService.deleteArticle(id);
//        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//    }
}