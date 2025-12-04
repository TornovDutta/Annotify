package org.example.annotify.utility;

import org.example.annotify.dto.UserDTO;
import org.example.annotify.model.Users;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public UserDTO toDto(Users users){
        return new UserDTO(users.getId(), users.getName());
    }
    public List<UserDTO> toDtoList(List<Users> users){
        return users.stream().map(this::toDto).collect(Collectors.toList());
    }
    public Users toEntity(UserDTO usersDTO){
        return new Users(
                usersDTO.id(),
                usersDTO.name()
        );
    }
    public List<Users> toEntityList(List<UserDTO> usersDTOS){
        return usersDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }

}
