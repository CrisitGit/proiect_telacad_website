package com.proiect_3.aeroport.repository;

import com.proiect_3.aeroport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
