package com.openclassrooms.rentals.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data //Annotation Lombok qui gère setter et getter
@Entity //Annotation qui indique que la classe correspond à une table de la base de données
@Table(name = "messages") //Table des rentals
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="rental_id")
    private int rentalId;

    @Column(name="user_id")
    @NotNull
    private int userId;

    private String message;

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;
}
