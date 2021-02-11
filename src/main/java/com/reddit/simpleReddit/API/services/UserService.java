package com.reddit.simpleReddit.API.services;

import com.reddit.simpleReddit.API.models.Role;
import com.reddit.simpleReddit.API.models.User;
import com.reddit.simpleReddit.API.repositories.RoleRepository;
import com.reddit.simpleReddit.API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User findUserByUsername (String username){
        return userRepository.findUserByUsername(username);
    }

    public Boolean saveUser(){
        User admin=new User(Long.valueOf(1),"admin","admin@gmail.com",passwordEncoder.encode("123"),true,new Role(Long.valueOf(1),"ADMIN"));
        User user=new User(Long.valueOf(2),"user","user@gmail.com",passwordEncoder.encode("123"),true,new Role(Long.valueOf(2),"USER"));
        userRepository.save(user);
        userRepository.save(admin);
        return true;
    }

    public void register(String userName,String email, String password){
        User user=new User(Long.valueOf(0),userName, email, passwordEncoder.encode(password),true,roleRepository.findRoleByRole("USER"));
        System.out.println(user);
        userRepository.save(user);
    }


}
