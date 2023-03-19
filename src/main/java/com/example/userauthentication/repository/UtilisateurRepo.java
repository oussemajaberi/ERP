package com.example.userauthentication.repository;

import com.example.userauthentication.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByUserName(String userName);
}
