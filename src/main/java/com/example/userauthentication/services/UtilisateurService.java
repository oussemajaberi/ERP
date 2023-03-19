package com.example.userauthentication.services;

import com.example.userauthentication.model.Role;
import com.example.userauthentication.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur saveUser(Utilisateur user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    Utilisateur getUser(String username);
    List<Utilisateur> getUsers();

}
