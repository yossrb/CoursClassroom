package tn.esprit.projetclassroom.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data

public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeClasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToMany(mappedBy = "classe")
    Set<CoursClassroom>coursClassrooms;

}
