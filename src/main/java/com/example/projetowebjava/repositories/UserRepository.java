package com.example.projetowebjava.repositories;

import com.example.projetowebjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
