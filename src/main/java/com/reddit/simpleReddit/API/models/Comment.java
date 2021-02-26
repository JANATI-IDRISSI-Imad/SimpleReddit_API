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
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long vote;
    private String description;
    @OneToMany(cascade = {CascadeType.ALL})
    List<Comment> comments;
}
