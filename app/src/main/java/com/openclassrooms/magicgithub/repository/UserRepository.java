package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // Check : Attente variable de test pour valider
        List<User> usersActual = apiService.getUsers();
        return usersActual;
    }

    public void generateRandomUser() {
        // TODO: A modifier
        //D'après la consigne on veux ajouter un utilisateur aléatoire
       apiService.generateRandomUser();

    }

    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
    }
}
