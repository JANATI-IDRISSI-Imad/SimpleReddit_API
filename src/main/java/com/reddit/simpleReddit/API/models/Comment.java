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
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="subject_id", nullable=false)
    private Subject subject;
    @OneToMany(cascade = {CascadeType.ALL})
    List<Comment> comments;
}
