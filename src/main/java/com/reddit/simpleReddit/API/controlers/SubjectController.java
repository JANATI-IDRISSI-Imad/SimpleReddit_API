package com.reddit.simpleReddit.API.controlers;

import com.reddit.simpleReddit.API.models.Subject;
import com.reddit.simpleReddit.API.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Subject")
@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @GetMapping("all")
    public Iterable<Subject> subjects(){
        return subjectService.getAllSubjects();
    }
    @GetMapping("{id}")
    public Subject subject(@PathVariable Long id){
        return subjectService.getSubjectByID(id);
    }
    @PutMapping({"vote/{id}"})
    public Subject vote(@PathVariable Long id, @RequestBody String vote){
        System.out.println(vote);
        return subjectService.vote(id,vote);
    }


    @GetMapping("/test")
    public Iterable<Subject> test(){
        return subjectService.getAllSubjects();
    }

}
