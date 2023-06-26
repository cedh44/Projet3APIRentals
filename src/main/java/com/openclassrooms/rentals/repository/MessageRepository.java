package com.openclassrooms.rentals.repository;

import com.openclassrooms.rentals.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //Classe en tant que Bean / Son rôle est de communiquer avec la BDD
public interface MessageRepository extends CrudRepository<User, Long> {

}