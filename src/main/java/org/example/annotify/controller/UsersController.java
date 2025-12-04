package org.example.annotify.controller;

import lombok.RequiredArgsConstructor;
import org.example.annotify.model.Users;
import org.example.annotify.repo.UserRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsersController {
    private final UserRepo userRepo;
    @QueryMapping
    public List<Users> getAll() {
        return userRepo.findAll();
    }
    @MutationMapping
    public String add(@Argument String name,@Argument String password){
        userRepo.save(new Users(null,name,password));
        return "ok";
    }
}
