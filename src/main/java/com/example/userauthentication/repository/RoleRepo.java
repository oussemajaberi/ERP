package com.example.userauthentication.repository;

import com.example.userauthentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
    Role findByName(String name);
}
