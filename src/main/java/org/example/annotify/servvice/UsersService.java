package org.example.annotify.servvice;

import org.example.annotify.dto.UserDTO;
import org.example.annotify.model.Users;

import java.util.List;

public interface UsersService {
    List<UserDTO> getUsers();
}
