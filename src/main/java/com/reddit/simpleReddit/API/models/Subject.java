package com.reddit.simpleReddit.API.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String description_subject;
    private String title_subject;
    private String vote;

    @OneToMany(cascade = {CascadeType.ALL})
    List<Comment> comments;
    public String getSub(){
        return description_subject+ " "+ title_subject;
    }
}
