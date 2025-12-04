package org.example.annotify.controller;

import lombok.RequiredArgsConstructor;
import org.example.annotify.dto.UserDTO;
import org.example.annotify.model.Users;
import org.example.annotify.repo.UserRepo;
import org.example.annotify.servvice.UsersService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    private final UserRepo userRepo;
    private final UsersService service;
    @QueryMapping
    public List<UserDTO> getAll() {
        return service.getUsers();

    }
    @MutationMapping
    public String add(@Argument String name,@Argument String password){
        userRepo.save(new Users(null,name,password));
        return "ok";
    }
}
