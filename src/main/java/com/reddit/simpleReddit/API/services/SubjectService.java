package com.reddit.simpleReddit.API.services;

import com.reddit.simpleReddit.API.models.Subject;
import com.reddit.simpleReddit.API.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
    public Subject getSubjectByID(Long id){
        Optional<Subject> optionalSubject = subjectRepository.findById(id);
        Subject subject = null;
        if(optionalSubject.isPresent()){
            subject = optionalSubject.get();
        }else{
            throw new RuntimeException(";iugui;g"+ id);
        }
        return subject;
    }

    public Iterable<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public void addSubject(Subject subject){
        subjectRepository.save(subject);
    }

    public void ajouterSubjectSession(Subject subject){

        subject.setDescription_subject("ouegfiwluef");
        subject.setTitle_subject("iuwge");
        subject.setVote("Good");
        subjectRepository.save(subject);
    }
    
    public Subject vote(Long id, String vote){
        Subject subject= subjectRepository.findById(id).get();
        subject.setVote(vote);
        subjectRepository.save(subject);
        return  subject;
    }


    public List<Subject> getSubjectsByKeyworld(String keyword){
        Iterable<Subject>subjects=subjectRepository.findAll();
        List<Subject>subjectList=new ArrayList<>();
        for (Subject s: subjects) {
            if(s.getSub().toLowerCase().contains(keyword.toLowerCase())){
                subjectList.add(s);
            }
        }
        return subjectList;
    }

}
