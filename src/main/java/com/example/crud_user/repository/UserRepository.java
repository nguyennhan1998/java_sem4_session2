package com.example.crud_user.repository;

import com.example.crud_user.entity.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User,Long>{


}
