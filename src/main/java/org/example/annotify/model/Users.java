package org.example.annotify.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    private String id;
    private String name;
    private String password;

    public Users(String id, String name) {
        this.id = id;
        this.name = name;
    }
}