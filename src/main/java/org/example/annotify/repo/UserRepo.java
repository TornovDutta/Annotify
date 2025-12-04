package org.example.annotify.repo;

import org.example.annotify.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Users,String> {
}
