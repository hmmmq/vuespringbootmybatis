package com.example.demo.controller;

import com.example.demo.entity.Comments;

import com.example.demo.service.ICommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private ICommentsService commentsService;

    @GetMapping
    public List<Comments> getAllComments() {
        return commentsService.list();
    }

    @GetMapping("/{id}")
    public Comments getCommentById(@PathVariable Integer id) {
        return commentsService.getById(id);
    }

    @PostMapping
    public void addComment(@RequestBody Comments comment) {
        commentsService.save(comment);
    }

    @PutMapping("/{id}")
    public void updateComment(@PathVariable Integer id, @RequestBody Comments comment) {
        commentsService.updateById(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Integer id) {
        commentsService.removeById(id);
    }
}