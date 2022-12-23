package tn.esprit.projetclassroom.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur;
    private String Prenom;
    private String password;
    private String nom;
    @ManyToOne
    private Classe classe;

}
