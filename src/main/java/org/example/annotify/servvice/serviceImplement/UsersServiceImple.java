package org.example.annotify.servvice.serviceImplement;

import lombok.RequiredArgsConstructor;
import org.example.annotify.dto.UserDTO;
import org.example.annotify.model.Users;
import org.example.annotify.repo.UserRepo;
import org.example.annotify.servvice.UsersService;
import org.example.annotify.utility.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImple implements UsersService {
    private final UserRepo repo;
    private final UserMapper mapper;
    public List<UserDTO> getUsers(){
        List<Users> users=repo.findAll();
        return mapper.toDtoList(users);
    }
}
