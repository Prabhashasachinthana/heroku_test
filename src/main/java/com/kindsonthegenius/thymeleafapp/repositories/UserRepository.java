package com.kindsonthegenius.thymeleafapp.repositories;


import com.kindsonthegenius.thymeleafapp.models.Role;
import com.kindsonthegenius.thymeleafapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   // Optional<User> findByUsername(String username);
   User findByUsername(String username);

    User findById(int id);

    List<User> findAllByRoles(Role role);



}
