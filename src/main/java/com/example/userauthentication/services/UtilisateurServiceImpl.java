package com.example.userauthentication.services;

import com.example.userauthentication.model.Role;
import com.example.userauthentication.model.Utilisateur;
import com.example.userauthentication.repository.RoleRepo;
import com.example.userauthentication.repository.UtilisateurRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class UtilisateurServiceImpl implements  UtilisateurService{

    @Autowired
    private UtilisateurRepo utilisateurRepo;
    @Autowired
    private RoleRepo roleRepo;


    @Override
    public Utilisateur saveUser(Utilisateur utilisateur) {
        log.info("Saving new user {} to the database", utilisateur.getUserName());
        return utilisateurRepo.save(utilisateur);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        Utilisateur utilisateur=utilisateurRepo.findByUserName(username);
        Role role=roleRepo.findByName(roleName);
        utilisateur.getRole().add(role);

    }

    @Override
    public Utilisateur getUser(String username) {
        log.info("fetching user {},username");
        return utilisateurRepo.findByUserName(username);
    }

    @Override
    public List<Utilisateur> getUsers() {
        log.info("fetching all users");
        return utilisateurRepo.findAll();
    }
}
