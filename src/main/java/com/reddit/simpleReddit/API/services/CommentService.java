package com.reddit.simpleReddit.API.services;

import com.reddit.simpleReddit.API.models.Comment;
import com.reddit.simpleReddit.API.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Optional<Comment>getCommentById(Long id){ return commentRepository.findById(id); }


    public Boolean addComment(Comment comment){

       try {
           commentRepository.save(comment);
           return true;
       }catch (Exception e ){
           System.out.println("-------------------"+e.getMessage());
           return false;
       }

    }


}
