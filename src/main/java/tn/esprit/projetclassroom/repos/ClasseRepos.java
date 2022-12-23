package tn.esprit.projetclassroom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projetclassroom.entities.Classe;

@Repository

public interface ClasseRepos extends JpaRepository <Classe,Integer>{
}
