package tn.esprit.projetclassroom.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projetclassroom.entities.Classe;
import tn.esprit.projetclassroom.entities.CoursClassroom;
import tn.esprit.projetclassroom.entities.Niveau;
import tn.esprit.projetclassroom.entities.Utilisateur;
import tn.esprit.projetclassroom.repos.ClasseRepos;
import tn.esprit.projetclassroom.repos.CoursClassroomRepos;
import tn.esprit.projetclassroom.repos.UtilisateurRepos;


@Service
@AllArgsConstructor

public class projetService implements projetImp {
    private UtilisateurRepos utilisateurRepos;
    private ClasseRepos classeRepos;
    private CoursClassroomRepos coursClassroomRepos;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepos.save(utilisateur);
    }

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepos.save(c);
    }

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe=classeRepos.findById(codeClasse).orElse(null);
        cc.setClasse(classe);
        return coursClassroomRepos.save(cc);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur utilisateur=utilisateurRepos.findById(idUtilisateur).orElse(null);
        Classe classe=classeRepos.findById(codeClasse).orElse(null);
        utilisateur.setClasse(classe);
        utilisateurRepos.save(utilisateur);

    }

    @Override
    public Integer nbUtilisateursParNiveau(Niveau nv) {
        return utilisateurRepos.countByClasseNiveau(nv);
    }


}
