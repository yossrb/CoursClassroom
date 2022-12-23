package tn.esprit.projetclassroom.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.projetclassroom.entities.Classe;
import tn.esprit.projetclassroom.entities.CoursClassroom;
import tn.esprit.projetclassroom.entities.Niveau;
import tn.esprit.projetclassroom.entities.Utilisateur;
import tn.esprit.projetclassroom.service.projetImp;

@RestController
@AllArgsConstructor
public class Controller {

    private projetImp  ip;
    @PostMapping("ajoutuser")
    public Utilisateur ajouterUtilisateur (@RequestBody Utilisateur utilisateur){
        return ip.ajouterUtilisateur(utilisateur);

    }
@PostMapping("/ajoutclasse")
    public Classe ajouterClasse (@RequestBody Classe c){

        return ip.ajouterClasse(c);
    }
    @PostMapping("/ajoutcoursclassroom")
    public CoursClassroom ajouterCoursClassroom (@RequestBody CoursClassroom cc, Integer codeClasse)
    {
        return ip.ajouterCoursClassroom(cc, codeClasse);
    }
@PostMapping("/affectuser/{idUtilisateur}/{codeClasse}")
    public void affecterUtilisateurClasse (@PathVariable Integer idUtilisateur, @PathVariable Integer codeClasse){
ip.affecterUtilisateurClasse(idUtilisateur,codeClasse);
    }
    @PostMapping("/nbuser")
    public Integer nbUtilisateursParNiveau(Niveau nv){
        return ip.nbUtilisateursParNiveau(nv);
    }
}
