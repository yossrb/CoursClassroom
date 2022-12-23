package tn.esprit.projetclassroom.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class CoursClassroom  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom;
    private Integer nbHeures;
    private Boolean archive;
    @ManyToOne
    private Classe classe;
}
