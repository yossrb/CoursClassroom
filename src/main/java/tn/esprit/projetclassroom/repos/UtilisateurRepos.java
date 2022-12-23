package tn.esprit.projetclassroom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projetclassroom.entities.Niveau;
import tn.esprit.projetclassroom.entities.Utilisateur;

import javax.jnlp.IntegrationService;

public interface UtilisateurRepos extends JpaRepository<Utilisateur, Integer> {
    Integer countByClasseNiveau(Niveau niveau);
}
