package tn.esprit.projetclassroom.service;

import tn.esprit.projetclassroom.entities.Classe;
import tn.esprit.projetclassroom.entities.CoursClassroom;
import tn.esprit.projetclassroom.entities.Niveau;
import tn.esprit.projetclassroom.entities.Utilisateur;

public interface projetImp {
    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);
    public Classe ajouterClasse (Classe c);
    public CoursClassroom ajouterCoursClassroom (CoursClassroom cc, Integer codeClasse);
    public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);
    public Integer nbUtilisateursParNiveau(Niveau nv);
}
