package com.reddit.simpleReddit.API.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String username;
    private String email;
    private String password;
    private Boolean active;
    @OneToOne
    private Role role;

    public User(String username, String email, String password, Boolean active,Role role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.active=active;
        this.role = role;
    }


}
