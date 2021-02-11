package com.reddit.simpleReddit.API.controlers;

import com.reddit.simpleReddit.API.models.Subject;
import com.reddit.simpleReddit.API.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Subject")
@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @GetMapping("all")
    public Iterable<Subject> subjects(){
        System.out.println("ana t3iyatli");
        return subjectService.getAllSubjects();
    }
}
