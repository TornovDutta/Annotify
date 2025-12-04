package org.example.annotify.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Users(@Id String id, String name, String password) {
}