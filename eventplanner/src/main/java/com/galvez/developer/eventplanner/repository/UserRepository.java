package com.galvez.developer.eventplanner.repository;


import com.galvez.developer.eventplanner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
