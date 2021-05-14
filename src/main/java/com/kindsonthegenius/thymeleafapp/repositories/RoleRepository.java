package com.kindsonthegenius.thymeleafapp.repositories;

import com.kindsonthegenius.thymeleafapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String role);

    @Modifying
    @Transactional
    @Query(value = "UPDATE users_roles SET role_id = 3 where user_id=?1",nativeQuery = true)
    void update(int id);
}
